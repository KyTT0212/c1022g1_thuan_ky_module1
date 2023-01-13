use case_study;

-- vị trí
insert into vi_tri value (1,"QuảnLý");
insert into vi_tri value (2,"NhânViên");

-- trình độ
insert into trinh_do value (1,"TrungCấp");
insert into trinh_do value (2,"CaoĐẳng");
insert into trinh_do value (3,"ĐạiHọc");
insert into trinh_do value (4,"SauĐạiHọc");
	
-- bộ phận
insert into bo_phan value (1,"Sale-Marketing");
insert into bo_phan value (2,"Hànhchính");
insert into bo_phan value (3,"Phụcvụ");
insert into bo_phan value (4,"Quảnlý");

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

-- loại khách
insert into loai_khach value (1,"Diamond");
insert into loai_khach value (2,"Platinium");
insert into loai_khach value (3,"Gold");
insert into loai_khach value (4,"Silver");
insert into loai_khach value (5,"Member");

-- kiểu thuê
insert into kieu_thue value (1,"year");
insert into kieu_thue value (2,"month");
insert into kieu_thue value (3,"day");
insert into kieu_thue value (3,"hour");

-- loại dịch vụ
insert into loai_dich_vu value (1,"Villa");
insert into loai_dich_vu value (2,"House");
insert into loai_dich_vu value (2,"Room");

-- dịch vụ
insert into dich_vu value (1,"Villa Beach Front",25000,1000000,10,"vip","Có hồ bơi",500,4,null,3,1);
insert into dich_vu value (2,"House Princess 01",14000,5000000,7,"vip","Có thêm bếp nướng",null,3,null,2,2);
insert into dich_vu value (3,"Room Twin 01",5000,1000000,2,"normal","Có tivi",null,null,"1 Xe máy, 1 Xe đạp",4,3);
insert into dich_vu value (4,"Villa No Beach Front",22000,9000000,8,"normal","Có hồ bơi",300,3,null,3,1);
insert into dich_vu value (5,"House Princess 02",10000,4000000,5,"normal","Có thêm bếp nướng",null,2,null,3,2);
insert into dich_vu value (6,"Room Twin 02",3000,900000,2,"normal","Có tivi",null,null,"1 Xe máy",4,3);

-- dịch vụ đi kèm
insert into dich_vu_di_kem value
(1,"Karaoke",10000,"giờ","tiện nghi, hiện tại"),
(2,"Thuê xe máy",10000,"chiếc","hỏng 1 xe"),
(3,"Thuê xe đạp",20000,"chiếc","tốt"),
(4,"Buffet buổi sáng",15000,"suất","đầy đủ đồ ăn, tráng miệng"),
(5,"Buffet buổi trưa",90000,"suất","đầy đủ đồ ăn, tráng miệng"),
(6,"Buffet buổi tối",16000,"suất","đầy đủ đồ ăn, tráng miệng");

-- hợp đông
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


