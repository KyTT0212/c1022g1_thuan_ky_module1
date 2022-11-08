function ungDungMt(dau) {
    alert("dau la "+ dau)
    let a= parseInt(document.getElementById("sothunhat").value) ;
    let b=  parseInt(document.getElementById("sothuhai").value);

   if (dau=='+')
       ketqua=a+b
    else if (dau='-')
        ketqua=a-b

   alert(ketqua)

    document.getElementById("kq").innerHTML=ketqua;
}