package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;


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
    }
}