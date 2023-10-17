<!DOCTYPE html>
<#import "/spring.ftl" as spring />

<html>

<head>
    <meta charset="utf-8">
    <title>Hello Spring</title>
</head>

<body>
    <h2>test page</h2>
    <#list messages as message>
        ${message.username} : ${message.message}<br>
    </#list>
</body>

</html>