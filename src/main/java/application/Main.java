package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("TEST 1: Seller findById");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("TEST 2: Seller findByDepartment");
        List<Seller> sellerList = sellerDao.findByDepartment(new Department(2, null));

        for (Seller sel: sellerList) {
            System.out.println(sel);
        }

        System.out.println("TEST 3: Seller findByAll");
        sellerList = sellerDao.findAll();
        for (Seller sel: sellerList) {
            System.out.println(sel);
        }

        System.out.println("TEST 4: Seller insert");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, new Department(2, null));
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New Id = " + newSeller.getId());

        System.out.println("TEST 5: Seller update");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update Completed");

        System.out.println("TEST 6: Seller delete");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id to delete: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete Completed");
        sc.close();
    }
}