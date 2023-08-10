# Rent A Car Project

Car Van Truck tipinde araçlarımız olacak bu class'larımızın ortak olan method ve field'ları için bir parent abstract class tanımlayacağız.
rent metodumuz bütün tiplerimizde ortak olacak.
Sınıflarımızın üzerinde VehicleType tipinde bir enum olacak ve bu enum içerisinde ilgili araç tipini kiralamak için
gerekli olan minimum ehliyet yılı ve hata mesajı yer alacak. Bu kısıtlamayı sadece Truck için uygulayacağız.
Car sınıfının ikinci bir sürücüsü olabilir ve bu seçildiğinde toplam ücrete 100 lira ekstra ücret yansıtılmalı.
returnVehicle metodumuz abstract bir method olacak, yani bütün child class'larımız bunu kendileri implemente etmek zorunda