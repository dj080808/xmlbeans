@rem Streaming Instance Validator
@rem
@rem Validates an instance against a schema.

@echo off

setlocal
call _setlib

set cp=
set cp=%cp%;%XMLBEANS_LIB%\xbean.jar
set cp=%cp%;%XMLBEANS_LIB%\jsr173_api.jar
set cp=%cp%;%XMLBEANS_LIB%\jsr173_ri.jar

java -classpath %cp% org.apache.xmlbeans.impl.tool.StreamInstanceValidator %*

:done