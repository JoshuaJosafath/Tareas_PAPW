 // document.GetElementById("elemento");
    function SumNumNat(/*n*/) {
        
        $("#SUM").click(function(){
            
            
            var n = $("#Num").val();
            var res = n * (+n + 1)/2;
            $("#Result").text(res);
        }
        );
        /*
        n = n.value;
        var resul =  n*(+n + 1)/2;
        var e = document.getElementById("Result");
        e.innerHTML = resul;
        return resul;*/
    }