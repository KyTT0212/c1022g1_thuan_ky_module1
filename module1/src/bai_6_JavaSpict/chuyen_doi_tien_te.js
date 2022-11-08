function chuyenTien () {
    let soTien = document.getElementById("amount").value;
    alert(soTien)
    let from = document.getElementById("From").value;
    alert(from)
    let to = document.getElementById("To").value;
    alert(to)
    let Result;

    if (from=="VND" && to=="USD"){
        Result= (soTien/23000)+'$'
    }
    else if (from=="USD" && to=="VND"){
        Result=(soTien*23000)+'Đ'
    }
    else if (from=="VND" && to=="VND"){
        Result=soTien+'Đ'
    }
    else if (from=="USD" && to=="USD"){
        Result=soTien+'$'
    }
    document.getElementById("ketQua").innerHTML=Result;
}