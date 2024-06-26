package com.mycompany.prolab_2.repository;


import com.mycompany.prolab_2.entity.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
   

    private static List<User> repo = null;
    private static long sequence ; 

    
    private UserRepository() {
        
    }


    public static synchronized List<User> initRepo() {
        if (repo == null){
            repo = new ArrayList<>();
            sequence = 1;
       
        }
        return repo;
    }
     public static List<User> listele(){
         initRepo();
        return repo;
    }
    /*public static User ekle(String kullaniciAdi,String sifre){
       initRepo();
        User user=new User(kullaniciAdi,sifre);
        user.setId(sequence++);
        repo.add(user);
        return user;
    }*/
    public static void sil( Long id){
       initRepo();
        repo = repo.stream().filter(user -> user.getId().equals(id)==false).toList();
    }
     public static User guncelle(Long id,String kullaniciAdi,String sifre){
        initRepo();
        User user= repo.stream().filter(tmpUser -> tmpUser.getId().equals(id)).findFirst().orElse(null);
        user.setKullaniciAdi(kullaniciAdi==null || kullaniciAdi.trim().length()==0 ? user.getKullaniciAdi(): kullaniciAdi );
        user.setSifre(sifre==null || sifre.trim().length()==0 ? user.getSifre() : sifre );
  
        return user;
    }
     public static void yazdir(){
         List<User> userList= listele();
          for (int i = 0; i < userList.size() ; i++) {
            User user = userList.get(i);
            System.out.println(user);
              System.out.println(" ");
        }
     }
    
}
