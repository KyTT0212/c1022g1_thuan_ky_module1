<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 2/12/2023
  Time: 11:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>lienhe</title>
    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <style>
        * {
            box-sizing: border-box;
        }

        body {
            /*background-image: url("/img/bg.jpeg");*/
            margin: 0;
            padding: 0;
            line-height: normal !important;
            font-size: 16px;
            font-family: -webkit-pictograph;
            font-weight: 400;
            -webkit-font-smoothing: antialiased;
            -webkit-text-size-adjust: 100%;
        }

        #header-nav {
            /*background-image: url();*/
            background-size: cover;
            background-repeat: no-repeat;
        }

        .c-item {
            height: 600px;
        }

        .c-img {
            height: 100%;
            /*object-fit: cover;*/
            filter: brightness(0.6);
        }

        h2::after {
            content: "";
            width: 140px;
            position: absolute;
            margin: 0 auto;
            height: 3px;
            background: #db584e;
            left: 0;
            right: 0;
            bottom: -10px;
            opacity: .8;
        }

        .col-center {
            margin: 0 auto;
            float: none !important;
        }

        .container .carousel {
            margin: 50px auto;
            padding: 0 70px;
        }

        .container .carousel-item {
            color: #999;
            font-size: 14px;
            text-align: center;
            overflow: hidden;
            min-height: 290px;
        }

        .container .carousel .item .img-box {
            width: 135px;
            height: 135px;
            margin: 0 auto;
            padding: 5px;
            border: 1px solid #ddd;
            border-radius: 50%;
        }

        .container .carousel .img-box img {
            width: 100%;
            height: 100%;
            display: block;
            border-radius: 50%;
        }

        .container .carousel .testimonial {
            padding: 30px 0 10px;
        }

        .container .carousel .overview {
            font-style: italic;
        }

        .container .carousel .overview b {
            text-transform: uppercase;
            color: #db584e;
        }

        .container .carousel .carousel-control {
            width: 40px;
            height: 40px;
            margin-top: -20px;
            top: 50%;
            background: none;
        }

        .container .carousel-control i {
            font-size: 68px;
            line-height: 42px;
            position: absolute;
            display: inline-block;
            color: rgba(0, 0, 0, 0.8);
            text-shadow: 0 3px 3px #e6e6e6, 0 0 0 #000;
        }

        .container .carousel .carousel-indicators {
            bottom: -40px;
        }

        .container .carousel-indicators li, .carousel-indicators li.active {
            width: 10px;
            height: 10px;
            margin: 1px 3px;
            border-radius: 50%;
        }

        .container .carousel-indicators li {
            background: #999;
            border-color: transparent;
            box-shadow: inset 0 2px 1px rgba(0, 0, 0, 0.2);
        }

        .container .carousel-indicators li.active {
            background: #555;
            box-shadow: inset 0 2px 1px rgba(0, 0, 0, 0.2);
        }
        footer {
            background: #101010;
            padding: 86px 0;
        }
        .single-content {
            text-align: center;
            padding: 115px 0;
        }
        .single-box p {
            color: #fff;
            line-height: 1.9;
        }
        .single-box h3 {
            font-size: 16px;
            font-weight: 700;
            color: #fff;
        }
        .single-box .card-area i {
            color: #ffffff;
            font-size: 20px;
            margin-right: 10px;
        }
        .single-box ul {
            list-style: none;
            padding: 0;
        }
        .single-box ul li a {
            text-decoration: none;
            color: #fff;
            line-height: 2.5;
            font-weight: 100;
        }
        .single-box h2 {
            color: #fff;
            font-size: 20px;
            font-weight: 700;
        }
        #basic-addon2 {
            background: #fe1e4f;
            color: #fff;
        }
        .socials i {
            font-size: 18px;
            margin-right: 15px;
        }
        @media (max-width: 767px) {
            .single-box {
                margin-bottom: 50px;
            }
        }
        @media (min-width: 768px) and (max-width: 991px) {
            .single-box {
                margin-bottom: 50px;
            }
        }
    </style>
</head>
<body>
<header>
    <div class="container-fluid">
        <div class="row">
            <nav class="navbar navbar-expand-lg navbar-light bg-dark" id="header-nav">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#"><img src="/img/logo.png" alt=""
                                                          style="width: 80px;height: 60px"></a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                            data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false"
                            aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarScroll">
                        <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll"
                            style="--bs-scroll-height: 100px;">
                            <li class="nav-item">
                                <a class="nav-link active text-white" aria-current="page" href="#">Trang chủ</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active text-white" aria-current="page" href="#">Sản phẩm</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active text-white" aria-current="page" href="#">Chi tiết</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active text-white" aria-current="page" href="lienhe.jsp">Liên hệ</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active text-white" aria-current="page" href="#">Đăng ký</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active text-white" aria-current="page" href="login.jsp">Đăng nhập</a>
                            </li>
                        </ul>
                        <form class="d-flex" style="margin-top: 16px; margin-right: 10px">
                            <input class="form-control me-2" type="search" placeholder="Tìm kiếm" aria-label="Search">
                            <button class="btn btn-outline-warning" type="submit" style="width: 136px">Tìm kiếm</button>
                        </form>
                    </div>
                </div>
            </nav>
        </div>
    </div>
</header>
<div class="row">
    <div id="hero-carousel" class="carousel slide" data-bs-ride="carousel">
        <div class="carousel-indicators">
            <button type="button" data-bs-target="#hero-carousel" data-bs-slide-to="0" class="active"
                    aria-current="true" aria-label="Slide 1"></button>
            <button type="button" data-bs-target="#hero-carousel" data-bs-slide-to="1" aria-label="Slide 2"></button>
            <button type="button" data-bs-target="#hero-carousel" data-bs-slide-to="2" aria-label="Slide 3"></button>
        </div>
        <div class="carousel-inner">
            <div class="carousel-item active c-item">
                <img src="/img/1.jpg" class="d-block w-100 c-img" alt="Slide 1">
            </div>
            <div class="carousel-item c-item">
                <img src="/img/2.jpg" class="d-block w-100 c-img" alt="Slide 2">
            </div>
            <div class="carousel-item c-item">
                <img src="img/3.jpg" class="d-block w-100 c-img" alt="Slide 3">
            </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#hero-carousel" data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#hero-carousel" data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
        </button>
    </div>
</div>

<div class="row">
    <div class="container-fluid pt-2">
       <div class="row" style="background: darkgray ; position: static">
               <main class="col-12">
                   <div class="text " style="font-size: 50px; color: white" >Contact Me</div>
<%--                   <img src="http://localhost:8082/img/logo.png" alt="" style="position: relative">--%>




<section class="contact pb-1">
    <div class="container" style="height: 550px">
        <div class="row content" STYLE="background: #f3fdff; height: 512px">
            <div class="col-md-5 mb-3">
                <div class="row mx-auto text-center" style="height: 10px">
                  <div class="section-title mb-100">
                      <img src="http://localhost:8082/img/logo.png" style="width:220px;" alt="">
                  </div>
              </div>
<%--                <div class="row"></div>--%>
            </div>
            <div class="col-md-7">
                <form>
                    <div class="form-group mt-2">
                        <label>Họ và tên</label>
                        <input type="name" placeholder="Nhập họ và tên" name="name" class="form-control">
                    </div>
                    <div class="form-group mt-2">
                        <label>Email</label>
                        <input type="email" placeholder="Nhập địa chỉ Email" name="email" class="form-control">
                    </div>
                    <div class="form-group mt-2">
                        <label>Số điện thoại</label>
                        <input type="sdt" placeholder="Nhập số điện thoại" name="sdt" class="form-control">
                    </div>
                    <div class="form-group mt-2">
                        <label>Nội dung</label>
                        <input type="content" placeholder="Nội dung liên hệ" name="content" class="form-control form-control-lg" style="height:150px ">
                    </div>
                    <p>Thời gian liên hệ:</p>
                    <div class="form-group form-check mt-2">
                        <input type="checkbox" name="checkbox" class="form-check-input" id="time1">
                        <label class="form-check-label" for="time1">Giờ hành chính</label>
                    </div>
                    <div class="form-group form-check mt-2">
                        <input type="checkbox" name="checkbox" class="form-check-input" id="time2">
                        <label class="form-check-label" for="time2">Bất kì lúc nào</label>
                    </div>
                    <button class="btn btn-class">Login</button>
                </form>
            </div>
        </div>
    </div>
</section>

               </main>
       </div>
    </div>
</div>

<footer>
    <div class="container">
        <div class="row">
            <div class="col-lg-3 col-sm-6">
                <div class="single-box">
                    <img src="img/logo.png" alt="" height="60" width="60">
                    <p>Đăng kí nhận thông tin ưu đãi hàng tuần của chúng tôi để kịp thời tham gia các chương trình hấp dẫn. </p>
                    <h3>We Accect</h3>
                </div>
            </div>
            <div class="col-lg-3 col-sm-6">
                <div class="single-box">
                    <h2>Văn phòng</h2>
                    <ul>
                        <li><a href="#">Codegym Đà Nẵng</a></li>
                        <li><a href="#">Số điện thoại: 1900 2237</a></li>
                        <li><a href="#">Email: info@vuabia.com</a></li>
                        <li><a href="#">C1022G1</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-lg-3 col-sm-6">
                <div class="single-box">
                    <h2>Thông tin liên lạc</h2>
                    <ul>
                        <li><a href="#">Nguyễn Lê Văn Khải</a></li>
                        <li><a href="#">Thái Quang Trường</a></li>
                        <li><a href="#">Trần Thuận Kỳ</a></li>
                        <li><a href="#">0702750320</a></li>
                        <li><a href="#">khainguyenlevan@gmail.com</a></li>
                        <li><a href="#">Trường Sơn, Cẩm Lệ, Đà Nẵng</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-lg-3 col-sm-6">
                <div class="single-box">
                    <h2>Đăng ký nhận tin khuyến mãi</h2>
                    <p>Vui lòng nhập email | hoặc số điện thoại | hoặc Facebook của bạn tại ô dưới đây:</p>
                    <div class="input-group mb-3">
                        <input type="text" class="form-control" placeholder="Vui lòng nhập" aria-label="Enter your Email ..." aria-describedby="basic-addon2">
                        <span class="input-group-text" id="basic-addon2"><i class="fa fa-check"></i></span>
                    </div>
                    <h2>Follow us on</h2>
                </div>
            </div>
        </div>
    </div>
</footer>
<script defer src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8"
        crossorigin="anonymous"></script>
</body>
</html>
