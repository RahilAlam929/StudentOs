@REM ----------------------------------------------------------------------------
@REM Licensed to the Apache Software Foundation (ASF) under one
@REM or more contributor license agreements.  See the NOTICE file
@REM distributed with this work for additional information
@REM regarding copyright ownership.  The ASF licenses this file
@REM to you under the Apache License, Version 2.0 (the
@REM "License"); you may not use this file except in compliance
@REM with the License.  You may obtain a copy of the License at
@REM
@REM    https://www.apache.org/licenses/LICENSE-2.0
@REM
@REM Unless required by applicable law or agreed to in writing,
@REM software distributed under the License is distributed on an
@REM "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
@REM KIND, either express or implied.  See the License for the
@REM specific language governing permissions and limitations
@REM under the License.
@REM ----------------------------------------------------------------------------

@REM Apache Maven Wrapper startup batch script, version 3.3.2

@IF "%__MVNW_ARG0_NAME__%"=="" (SET __MVNW_ARG0_NAME__=%~nx0)
@SET __MVNW_CMD__=
@SET __MVNW_ERROR__=
@SET __MVNW_PSMOD=%PSModulePath%
@SET PSModulePath=
@FOR /F "usebackq tokens=1* delims==" %%A IN (`powershell -noprofile "& {$scriptDir='%~dp0'; $wrapperJar=Join-Path $scriptDir '.mvn\wrapper\maven-wrapper.jar'; if (!(Test-Path $wrapperJar)) { Invoke-WebRequest -Uri 'https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.3.2/maven-wrapper-3.3.2.jar' -OutFile $wrapperJar }; $env:MAVEN_PROJECTBASEDIR=$scriptDir; & java -classpath $wrapperJar org.apache.maven.wrapper.MavenWrapperMain %*}"`) DO @IF "%%B"=="" (echo %%A) ELSE (SET __MVNW_CMD__=%%A %%B)
@SET PSModulePath=%__MVNW_PSMOD%
@IF NOT "%__MVNW_CMD__%"=="" (%__MVNW_CMD__% %*) ELSE (echo Error: Failed to run Maven Wrapper & exit /b 1)
