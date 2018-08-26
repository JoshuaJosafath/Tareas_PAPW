 // document.GetElementById("elemento");
    function SumNumNat(n) {
        n = n.value;
        var resul =  n*(+n + 1)/2;
        var e = document.getElementById("Result");
        e.innerHTML = resul;
        return resul;
    }