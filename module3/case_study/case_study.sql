create database case_study;
use case_study;

-- ================================= VỊ TRÍ ============================================
create table vi_tri(
ma_vt int primary key,
ten_vt varchar(45)
);

-- vị trí
insert into vi_tri value (1,"QuảnLý");
insert into vi_tri value (2,"NhânViên");


-- ================================== TRÌNH ĐỘ ========================================
create table trinh_do(
ma_td int primary key,
ten_td varchar(45)
);

-- trình độ
insert into trinh_do value (1,"TrungCấp");
insert into trinh_do value (2,"CaoĐẳng");
insert into trinh_do value (3,"ĐạiHọc");
insert into trinh_do value (4,"SauĐạiHọc");


-- ================================ BỘ PHẬN ===============================================
create table bo_phan(
ma_bp int primary key,
ten_bp varchar(45)
);

-- bộ phận
insert into bo_phan value (1,"Sale-Marketing");
insert into bo_phan value (2,"Hànhchính");
insert into bo_phan value (3,"Phụcvụ");
insert into bo_phan value (4,"Quảnlý");


-- ================================== NHÂN VIÊN =============================================
create table nhan_vien(
ma_nv int primary key,
ten_nv varchar(45) not null,
ngay_sinh date not null,
so_cmnd varchar(45) not null,
luong double not null,
sdt varchar(45) not null,
email varchar(45),
dia_chi varchar(45),
ma_vt int,
foreign key(ma_vt) references vi_tri(ma_vt),
ma_td int,
foreign key(ma_td) references trinh_do(ma_td),
ma_bp int,
foreign key(ma_bp) references bo_phan(ma_bp)
);

-- nhân viên
insert into nhan_vien value (1,"NguyễnVănAn","1970-11-07","456231786","10000000","0901234121","annguyen@gmail.com","295NguyễnTấtThành,ĐàNẵng",1,3,1);
insert into nhan_vien value (2,"LêVănBình","1997-04-09","654231234","7000000","0934212314","binhlv@gmail.com","22YênBái,ĐàNẵng",1,2,2);
insert into nhan_vien value (3,"HồThịYến","1995-12-12","999231723","14000000","0412352315","thiyen@gmail.com","K234/11ĐiệnBiênPhủ,GiaLai",1,3,2);
insert into nhan_vien value (4,"VõCôngToản","1980-04-04","123231365","17000000","0374443232","toan0404@gmail.com","77HoàngDiệu,QuảngTrị",1,4,4);
insert into nhan_vien value (5,"NguyễnBỉnhPhát","1999-12-09","456231786","6000000","0902341231","phatphat@gmail.com","43YênBái,ĐàNẵng",2,1,1);
insert into nhan_vien value (6,"KhúcNguyễnAnNghi","2000-11-08","964542311","7000000","0978653213","annghi20@gmail.com","294NguyễnTấtThành,ĐàNẵng",2,2,3);
insert into nhan_vien value (7,"NguyễnHữuHà","1993-01-01","534323231","8000000","0941234553","nhh0101@gmail.com","4NguyễnChíThanh,Huế",2,3,2);
insert into nhan_vien value (8,"NguyễnHàĐông","1989-09-03","234414123","9000000","0642123111","donghanguyen@gmail.com","111HùngVương,HàNội",2,4,4);
insert into nhan_vien value (9,"TòngHoang","1982-09-03","256781231","6000000","0245144444","hoangtong@gmail.com","213HàmNghi,ĐàNẵng",2,4,4);
insert into nhan_vien value (10,"NguyễnCôngĐạo","1994-01-08","755434343","8000000","0988767111","nguyencongdao12@gmail.com","6HoàKhánh,ĐồngNai",2,3,2);


-- ================================= LOẠI KHÁCH ==============================================
create table loai_khach(
ma_lk int primary key,
ten_lk varchar(45)
);

-- loại khách
insert into loai_khach value (1,"Diamond");
insert into loai_khach value (2,"Platinium");
insert into loai_khach value (3,"Gold");
insert into loai_khach value (4,"Silver");
insert into loai_khach value (5,"Member");


-- ================================== KHÁCH HÀNG =============================================
create table khach_hang(
ma_kh int primary key,
foreign key(ma_lk) references loai_khach(ma_lk),
ho_ten varchar(45) not null,
ngay_sinh date not null,
gioi_tinh bit not null,
so_cmnd varchar(45) not null,
sdt varchar(45) not null,
email varchar(45),
dia_chi varchar(45),
ma_lk int
);

insert into khach_hang value
(1,"Nguyễn Thị Hào","1970-11-07",0,"643431213","0945423362","thihao07@gmail.com","23 Nguyễn Hoàng, Đà Nẵng",5),
(2,"Phạm Xuân Diệu","1992-08-08",1,"865342123","0954333333","xuandieu92@gmail.com","K77/22 Thái Phiên, Quảng Trị",3),
(3,"Trương Đình Nghệ","1990-02-27",1,"488645199","0373213122","nghenhan2702@gmail.com","K323/12 Ông Ích Khiêm, Vinh",1),
(4,"Dương Văn Quan","1981-07-08",1,"543432111","0490039241","duongquan@gmail.com","K453/12 Lê Lợi, Đà Nẵng",1),
(5,"Hoàng Trần Nhi Nhi","1995-12-09",0,"795453345","0312345678","nhinhi123@gmail.com","224 Lý Thái Tổ, Gia Lai",4),
(6,"Tôn Nữ Mộc Châu","2005-12-06",0,"732434215","0988888844","tonnuchau@gmail.com","37 Yên Thế, Đà Nẵng",4),
(7,"Nguyễn Mỹ Kim","1984-04-08",0,"856453123","0912345698","kimcuong84@gmail.com","K123/45 Lê Lợi, Hồ Chí Minh",1),
(8,"Nguyễn Thị Hào","1999-04-08",0,"965656433","0763212345","haohao99@gmail.com","55 Nguyễn Văn Linh, Kon Tum",3),
(9,"Trần Đại Danh","1994-07-01",1,"432341235","0643343433","danhhai99@gmail.com","24 Lý Thường Kiệt, Quảng Ngãi",1),
(10,"Nguyễn Tâm Đắc","1989-07-01",1,"344343432","0987654321","dactam@gmail.com","22 Ngô Quyền, Đà Nẵng",2);


-- ================================ LOẠI DỊCH VỤ ===============================================
create table loai_dich_vu(
ma_ldv int primary key,
ten_ldv varchar(45)
);

-- loại dịch vụ
insert into loai_dich_vu value (1,"Villa");
insert into loai_dich_vu value (2,"House");
insert into loai_dich_vu value (3,"Room");


-- ================================ KIỂU THUÊ ===============================================
create table kieu_thue(
ma_kt int primary key,
ten_kt varchar(45)
);

-- kiểu thuê
insert into kieu_thue value (1,"year");
insert into kieu_thue value (2,"month");
insert into kieu_thue value (3,"day");
insert into kieu_thue value (4,"hour");


-- =============================== DỊCH VỤ ================================================
create table dich_vu(
ma_dv int primary key,
ten_dv varchar(45) not null,
dien_tich int,
chi_phi_thue double not null,
so_ng_toi_da int,
ma_kt int,
foreign key(ma_kt) references kieu_thue(ma_kt),
ma_ldv int,
foreign key(ma_ldv) references loai_dich_vu(ma_ldv),
tieu_chuan_phong varchar(45),
mo_ta_tien_nghi_khac varchar(45),
dien_tich_ho_boi varchar(45),
so_tang int,
dich_vu_mien_phi_di_kem text
);

-- dịch vụ
insert into dich_vu value (1,"Villa Beach Front",25000,1000000,10,3,1, "vip","Có hồ bơi",500,4,null);
insert into dich_vu value (2,"House Princess 01",14000,5000000,7,2,2, "vip","Có thêm bếp nướng",null,3,null);
insert into dich_vu value (3,"Room Twin 01",5000,1000000,2 ,4,3,"normal","Có tivi",null,null,"1 Xe máy, 1 Xe đạp");
insert into dich_vu value (4,"Villa No Beach Front",22000,9000000,8,3,1,"normal","Có hồ bơi",300,3,null);
insert into dich_vu value (5,"House Princess 02",10000,4000000,5,3,2,"normal","Có thêm bếp nướng",null,2,null);
insert into dich_vu value (6,"Room Twin 02",3000,900000,2,4,3,"normal","Có tivi",null,null,"1 Xe máy");


-- ================================= HỢP ĐỒNG ==============================================
create table hop_dong(
ma_hd int primary key,
ngay_lam_hop_dong date,
ngay_ket_thuc date,
tien_dat_coc double,
ma_nv int,
foreign key(ma_nv) references nhan_vien(ma_nv),
ma_kh int,
foreign key(ma_kh) references khach_hang(ma_kh),
ma_dv int,
foreign key(ma_dv) references dich_vu(ma_dv)
);
drop table hop_dong;

-- hợp đồng
insert into hop_dong value
(1,"2020-12-08","2020-12-08",0,3,1,3),
(2,"2020-07-14","2020-07-21",200000,7,3,1),   
(3,"2021-03-15","2020-03-17",50000,3,4,2),
(4,"2021-01-14","2021-01-18",100000,7,5,5),
(5,"2021-07-14","2021-07-15",0,7,2,6),
(6,"2021-06-01","2021-06-03",0,7,7,6),
(7,"2021-09-02","2021-09-05",100000,7,4,4),
(8,"2021-06-17","2021-06-18",150000,3,4,1),
(9,"2020-11-19","2020-11-19",0,3,4,3),
(10,"2021-04-12","2021-04-14",0,10,3,5),
(11,"2021-04-25","2021-04-25",0,2,2,1),
(12,"2021-05-25","2021-05-27",0,7,10,1);


-- ================================= DỊCH VỤ ĐI KÈM ==============================================
create table dich_vu_di_kem(
ma_dvdk int primary key,
ten_dvdk varchar(45),
gia double,
don_vi varchar(10),
trang_thai varchar(45)
);

-- dịch vụ đi kèm
insert into dich_vu_di_kem value
(1,"Karaoke",10000,"giờ","tiện nghi, hiện tại"),
(2,"Thuê xe máy",10000,"chiếc","hỏng 1 xe"),
(3,"Thuê xe đạp",20000,"chiếc","tốt"),
(4,"Buffet buổi sáng",15000,"suất","đầy đủ đồ ăn, tráng miệng"),
(5,"Buffet buổi trưa",90000,"suất","đầy đủ đồ ăn, tráng miệng"),
(6,"Buffet buổi tối",16000,"suất","đầy đủ đồ ăn, tráng miệng");


-- =============================== HỢP ĐỒNG CHI TIẾT ===============================================
create table hop_dong_chi_tiet(
ma_hdct int primary key,
so_luong int,
ma_hd int,
foreign key(ma_hd) references hop_dong(ma_hd),
ma_dvdk int,
foreign key(ma_dvdk) references dich_vu_di_kem(ma_dvdk)
);

-- hợp đông chi tiết
insert into hop_dong_chi_tiet value 
(1,5,2,4),
(2,8,2,5),
(3,15,2,6),
(4,1,3,1),
(5,11,3,2),
(6,1,1,3),
(7,2,1,2),
(8,2,12,2);

-- ================================== SQL 2-5 =============================================

-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
select * from nhan_vien
where substring_index(nhan_vien.ten_nv,' ',-1) like 'H%'
or substring_index(nhan_vien.ten_nv,' ',-1) like 'T%'
or substring_index(nhan_vien.ten_nv,' ',-1) like 'K%'
and length(ten_nv)<=15;


-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.    
select * from khach_hang
where (YEAR(curdate()) - YEAR(ngay_sinh)) between 18 and 50
and dia_chi like '%Đà Nẵng' or dia_chi like '%Quảng Trị';


-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select khach_hang.ma_kh, khach_hang.ho_ten, count(hop_dong.ma_kh) as 'Số lần đặt phòng của khách hàng'
from hop_dong inner join khach_hang on khach_hang.ma_kh= hop_dong.ma_kh
inner join loai_khach on loai_khach.ma_lk= khach_hang.ma_lk
where loai_khach.ten_lk like 'Diamond'
group by khach_hang.ma_kh
order by count(hop_dong.ma_kh);


