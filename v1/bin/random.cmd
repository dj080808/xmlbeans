@echo off

@rem DRT
@rem
@rem Invokes Random test

setlocal
if "%XMLBEANS_HOME%" EQU "" (set XMLBEANS_HOME=%~dp0..)

set cp=
set cp=%cp%;%XMLBEANS_HOME%\build\ar\xbean.jar
set cp=%cp%;%XMLBEANS_HOME%\build\lib\xml-apis.jar
set cp=%cp%;%XMLBEANS_HOME%\build\lib\xercesImpl.jar
set cp=%cp%;%XMLBEANS_HOME%\build\private\lib\random.jar
set cp=%cp%;%XMLBEANS_HOME%\build\private\lib\easypo.jar

rem java -Dxmlbeans.ea -Dtreeasserts=true  -Dxbean.rootdir=%XMLBEANS_HOME% -classpath %cp% Random -noquery %*
    java -Dxmlbeans.ea -Dtreeasserts=false -Dxbean.rootdir=%XMLBEANS_HOME% -classpath %cp% Random -noquery %*
