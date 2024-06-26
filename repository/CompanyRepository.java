package com.mycompany.prolab_2.repository;


import com.mycompany.prolab_2.Reservation;
import com.mycompany.prolab_2.Trip;
import com.mycompany.prolab_2.entity.Company;
import com.mycompany.prolab_2.vehicles.Vehicle;
import java.util.ArrayList;
import java.util.List;

public class CompanyRepository {
   
  
    private static List<Company> repo = null;
    private static long sequence ;
    private static long aracSequence;   

   
    private CompanyRepository() {
        
    }


    public static synchronized List<Company> initRepo() {
        if (repo == null){
            repo = new ArrayList<>();
            sequence = 1;
            aracSequence=10;
           
        }
        return repo;
    }
     public static List<Company> listele(){
         initRepo();
        return repo;
    }
    public static Company ekle(String kullaniciAdi,String sifre){
       initRepo();
        Company company=new Company(kullaniciAdi,sifre);
        company.setId(sequence++);
        repo.add(company);
        return company;
    }
    public static void sil( Long id){
       initRepo();
        repo = repo.stream().filter(company -> company.getId().equals(id)==false).toList();
    }
    public static Company guncelle(Long id,String kullaniciAdi,String sifre,int kullananUcret,int hizmetUcret){
        initRepo();
        Company company= repo.stream().filter(tmpCompany-> tmpCompany.getId().equals(id)).findFirst().orElse(null);
        company.setKullaniciAdi(kullaniciAdi==null || kullaniciAdi.trim().length()==0 ? company.getKullaniciAdi(): kullaniciAdi );
        company.setSifre(sifre==null || sifre.trim().length()==0 ? company.getSifre() : sifre );
        
        return company;
    }
     
  
    
    
    public static Company getCompanyById(Long id){
        return listele().stream().filter(company -> company.getId().equals(id)).findFirst().orElse(null);
    }

     public static void yazdir(){
         List<Company> companyList= listele();
          for (int i = 0; i < companyList.size() ; i++) {
            Company company = companyList.get(i);
            System.out.println(company);
              System.out.println(" ");
        }
     }
     
     public static void aracEkle(long id,Vehicle arac){
        Company tmpCompany = repo.stream().filter(company -> company.getId().equals(id)).findFirst().orElse(null);
        
        if(tmpCompany != null){
            arac.setAracID(aracSequence++);

            List<Vehicle> tmpVehicleList = new ArrayList<>(tmpCompany.getVehicles());
            tmpVehicleList.add(arac);
            tmpCompany.setVehicles(tmpVehicleList);      
        }

       
    }
     
     
    public static void aracSil(Long id,Long aracId){
        Company tmpCompany = repo.stream().filter(company -> company.getId().equals(id)).findFirst().orElse(null);
        
        if(tmpCompany != null){
            tmpCompany.setVehicles(tmpCompany.getVehicles().stream().filter(vehicles -> vehicles.getAracID().equals(aracId)==false).toList());
            for (Reservation reserv: ReservationRepository.listele()) {
                if(reserv.getArac().getAracID()==id){
                    ReservationRepository.sil(reserv.getId());
                }
            }          
                
            }
        }
    
        
    
    
    public static void tripEkle(long id,Trip trip){
         
        Company tmpCompany = repo.stream().filter(company -> company.getId().equals(id)).findFirst().orElse(null);
        
        if(tmpCompany != null){
            List<Trip> tmpTripList = new ArrayList<>(tmpCompany.getTrips());
            tmpTripList.add(trip);
            tmpCompany.setTrips(tmpTripList);        
        }

    }
     
     
    public static void tripSil(Long id,int tripId){
        Company tmpCompany = repo.stream().filter(company -> company.getId().equals(id)).findFirst().orElse(null);
        
        if(tmpCompany != null){
            tmpCompany.setTrips(tmpCompany.getTrips().stream().filter(trips -> trips.getSeferNo()==tripId==false).toList());            
        }
    }
    
 
    
}
