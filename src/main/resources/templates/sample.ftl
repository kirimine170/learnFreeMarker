<!DOCTYPE html>
<#import "/spring.ftl" as spring />

<html>

<head>
    <meta charset="utf-8">
    <title>Hello Spring</title>
</head>

<body>
    <h2>test page</h2>
    <!-- 
        NOTE FTLタグで拡張For文みたいなことができてるっぽい。　JSPがだいぶ省略された感じ
        https://freemarker.apache.org/docs/ref_directive_list.html 
    -->
    <#list messages as message>
        ${message.username} : ${message.message}<br>
    </#list>
</body>

</html>