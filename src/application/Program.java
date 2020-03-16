package application;

import java.util.List;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

    public static void main(String[] args) {
        
        SellerDao sellerDao = DaoFactory.createSellerDao();
        
        System.out.println("==== TEST 1: seller findById ===="); //Procurar por um ID especifico
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        
        System.out.println("==== TEST 2: seller findByDepartment ====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) { //para cada Seller obj na list ira mostrar o obj
            System.out.println(obj);
        }
    }
}
