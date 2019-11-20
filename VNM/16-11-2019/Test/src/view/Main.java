package view;

import controller.ProductController;
import model.Product;
import repository.ProductsCompre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            menu();
            choice=scanner.nextInt();
            switch (choice){
                case 1:{
                    List<Product> productList = productController.getProducts();
                    for (Product k : productList){
                        System.out.println("ID: " + k.getId() + " Name: " + k.getName() + ", Cost: " + k.getCost());
                    }
                    break;
                }
                case 2:{
                    Product product = Main.productForm();
                    productController.addProduct(product);
                    break;
                }
                case 3:{
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Nhap vao vi tri ban muon sua");
                    int choice1 = scanner1.nextInt();

                        Product product = Main.productUpdate();
                        productController.updateProduct(choice1, product);
                    break;
                }
                case 4:{

                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Nhap vao vi tri ban xoa");
                    int choice1 = scanner1.nextInt();

                        productController.removeProduct(choice1);

                        System.out.println("da xoa");
                    break;
                }
                case 5: {
                    System.out.println("Nhap ten san pham muon tim: ");
                    String nameSp = new Scanner(System.in).nextLine();
                    Product product = productController.findByName(nameSp);
                    if (product != null){
                        System.out.println(product.getName());
                    }else {
                        System.out.println("Khong tim thay ten san pham");
                    }

                    break;
                }
                case 6:{
                    productController.comparePrice();
                    List<Product> productList = productController.getProducts();
                    for (Product k : productList){
                        System.out.println("ID: " + k.getId() + " Name: " + k.getName() + ", Cost: " + k.getCost());
                    }
                    break;
                }
                case 0:{
                    System.out.println("Exit.");
                    break;
                }
            }
        }
        while (choice!=0);

    }
    public static void menu(){
        System.out.println("-------------------------------------------------------");
        System.out.println("                Quan ly san pham");
        System.out.println("        1.Hien thi danh sach san pham");
        System.out.println("        2.Them moi san pham");
        System.out.println("        3.Sua thong tin mot san pham");
        System.out.println("        4.Xoa thong tin san pham");
        System.out.println("        5.Tim san pham theo ten");
        System.out.println("        6.Sap xep san pham theo gia");
        System.out.println("*******************************************************");
        System.out.println("Nhap vao lua chon");
    }
    public static Product productForm(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ten");
        String name = scanner.nextLine();
        System.out.println("Nhap gia tien");
        int cost = scanner.nextInt();
        Product product = new Product(id,name,cost);
        return product;
    }
    public static Product productUpdate(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap id moi");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Nhap ten moi");
        String name = input.nextLine();
        System.out.println("Nhap gia tien moi");
        int cost = input.nextInt();
        Product product2 = new Product(id,name,cost);
        return product2;
    }
}

