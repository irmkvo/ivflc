<%-- 
    Document   : testPOST
    Created on : Dec 22, 2015, 12:29:13 AM
    Author     : kvo
--%>

<script type="text/javascript">    
    $(document).ready(function () {
            $.ajax({
                method: 'POST',
                datatype: 'jsonp',
                url: 'http://api.seasonvar.ru/',
                headers: {"Origin": "http://178.89.200.111"},
//                headers: { 'Access-Control-Allow-Origin': '*' },
                data: {"key": "8e2595cd", "command": "getSerialList"}
            }).done(function (msg) {
                    $("#results").append(msg);
                });
    });
</script>
<div id="results"></div>
