/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prolab_2;


import com.mycompany.prolab_2.entity.Company;
import com.mycompany.prolab_2.repository.CompanyRepository;
import com.mycompany.prolab_2.repository.TripRepository;
import com.mycompany.prolab_2.vehicles.Airplane;
import com.mycompany.prolab_2.vehicles.Bus;
import com.mycompany.prolab_2.vehicles.Train;
import com.mycompany.prolab_2.Pages.ilk;
import com.mycompany.prolab_2.person.Personel;
import com.mycompany.prolab_2.repository.ReservationRepository;
import com.mycompany.prolab_2.repository.StationRepository;
import java.util.LinkedList;


/**
 *
 * @author oztur
 */
public class Prolab_2 {

    public static void main(String[] args) {
       
        
        
       Station ist = StationRepository.ekle("istanbul");
       Station koc = StationRepository.ekle("kocaeli");
       Station bil = StationRepository.ekle("bilecik");
       Station esk = StationRepository.ekle("eskişehir");
       Station ank = StationRepository.ekle("ankara");
       Station kon = StationRepository.ekle("konya");  
        
        LinkedList<Station> gzr1= new LinkedList<>();
        gzr1.add(ist);
        gzr1.add(koc);
        gzr1.add(bil);
        gzr1.add(esk);
        gzr1.add(ank);
        gzr1.add(esk);
        gzr1.add(bil);
        gzr1.add(koc);
        gzr1.add(ist);
        
        LinkedList<Station> gzr2= new LinkedList<>();
        gzr2.add(koc);
        gzr2.add(koc);
        gzr2.add(bil);
        gzr2.add(esk);
        gzr2.add(kon);
        gzr2.add(esk);
        gzr2.add(bil);
        gzr2.add(koc);
        gzr2.add(koc);
        
        LinkedList<Station> gzr3= new LinkedList<>();
        gzr3.add(ist);
        gzr3.add(koc);
        gzr3.add(ank);
        gzr3.add(koc);
        gzr3.add(ist);
        gzr3.add(ist);
        gzr3.add(koc);
        gzr3.add(ank);
        gzr3.add(koc);
        gzr3.add(ist);
             
        
        
        LinkedList<Station> gzr4= new LinkedList<>();
        gzr4.add(ist);
        gzr4.add(koc);
        gzr4.add(esk);
        gzr4.add(kon);
        gzr4.add(esk);
        gzr4.add(koc);
        gzr4.add(ist);
      
        
        LinkedList<Station> gzr5= new LinkedList<>();
        gzr5.add(ist);
        gzr5.add(kon);
        gzr5.add(ist);
        
        LinkedList<Station> gzr6= new LinkedList<>();
        gzr6.add(ist);
        gzr6.add(ank);
        gzr6.add(ist);
        
      
        Trip trip1 = TripRepository.ekle(gzr1);
        Trip trip2 =TripRepository.ekle(gzr2);
        Trip trip3 =TripRepository.ekle(gzr3); 
        Trip trip4 =TripRepository.ekle(gzr4);
        Trip trip5 =TripRepository.ekle(gzr5);
        Trip trip6 =TripRepository.ekle(gzr6);
      
        Personel prs1=new Personel("kullanan");
        Personel prs2=new Personel("hizmet");
        
      
        Bus bus1=new Bus("otobus","otobus1","benzin",20,trip3,10);
        Bus bus2=new Bus("otobus","otobus2","benzin",15,trip3,10);
        Bus bus3=new Bus("otobus","otobus1","motorin",15,trip3,5);
        Bus bus4=new Bus("otobus","otobus2","motorin",20,trip4,5);
        Bus bus5=new Bus("otobus","otobus1","motorin",20,trip4,6);
        Train tren1=new Train("tren","tren1","elektrik",25,trip1,3);
        Train tren2=new Train("tren","tren2","elektrik",25,trip2,3);
        Train tren3=new Train("tren","tren3","elektrik",25,trip2,3);
        Airplane plane1= new Airplane("ucak","ucak1","gaz",30,trip5,25);
        Airplane plane2= new Airplane("ucak","ucak2","gaz",30,trip5,25);
        Airplane plane3= new Airplane("ucak","ucak1","gaz",30,trip6,20);
        Airplane plane4= new Airplane("ucak","ucak2","gaz",30,trip6,20);
     
        bus1.setKullananUct(5000);
        bus1.setHizmetUct(2000);
        bus2.setKullananUct(5000);
        bus2.setHizmetUct(2000);
        bus3.setKullananUct(3000);
        bus3.setHizmetUct(1500);
        bus4.setKullananUct(3000);
        bus4.setHizmetUct(1500);
        bus5.setKullananUct(4000);
        bus5.setHizmetUct(2000);
        tren1.setKullananUct(2000);
        tren1.setHizmetUct(1000);
        tren2.setKullananUct(2000);
        tren2.setHizmetUct(1000);
        tren3.setKullananUct(2000);
        tren3.setHizmetUct(1000);
        plane1.setKullananUct(10000);
        plane1.setHizmetUct(6000);
        plane2.setKullananUct(10000);
        plane2.setHizmetUct(6000);
        plane3.setKullananUct(7500);
        plane3.setHizmetUct(4000);
        plane4.setKullananUct(7500);
        plane4.setHizmetUct(4000);
        
        
        
        
        for (int i = 0; i < 2; i++) {
            bus1.personelListele().add(prs1);
            bus1.personelListele().add(prs2);    
        }
        
        for (int i = 0; i < 2; i++) {
            bus2.personelListele().add(prs1);
            bus2.personelListele().add(prs2);    
        }
        
        for (int i = 0; i < 2; i++) {
            bus3.personelListele().add(prs1);
            bus3.personelListele().add(prs2);    
        }
        
        for (int i = 0; i < 2; i++) {
            bus4.personelListele().add(prs1);
            bus4.personelListele().add(prs2);    
        }
        
        for (int i = 0; i < 2; i++) {
            bus5.personelListele().add(prs1);
            bus5.personelListele().add(prs2);    
        }
        
        for (int i = 0; i < 2; i++) {
            tren1.personelListele().add(prs1);
            tren1.personelListele().add(prs2);    
        }
        
        for (int i = 0; i < 2; i++) {
            tren2.personelListele().add(prs1);
            tren2.personelListele().add(prs2);    
        }
        
        for (int i = 0; i < 2; i++) {
            tren3.personelListele().add(prs1);
            tren3.personelListele().add(prs2);    
        }
        
        for (int i = 0; i < 2; i++) {
            plane1.personelListele().add(prs1);
            plane1.personelListele().add(prs2);    
        }
        
        for (int i = 0; i < 2; i++) {
            plane2.personelListele().add(prs1);
            plane2.personelListele().add(prs2);    
        }
        
        for (int i = 0; i < 2; i++) {
            plane3.personelListele().add(prs1);
            plane3.personelListele().add(prs2);    
        }
        
        for (int i = 0; i < 2; i++) {
            plane4.personelListele().add(prs1);
            plane4.personelListele().add(prs2);    
        }
        
        
        
        
        
        Route rota1=new Route("istanbul","ankara");
        Route rota2=new Route("istanbul","konya");
        Route rota3=new Route("kocaeli","ankara");
        Route rota4=new Route("kocaeli","konya");
        Route rota5=new Route("eskişehir","ankara");
        Route rota6=new Route("eskişehir","konya");
        
 
         bus1.koltukListele();
         bus2.koltukListele();
         bus3.koltukListele();
         bus3.koltukListele(); 
         bus4.koltukListele();
         bus5.koltukListele();
         tren1.koltukListele();
         tren2.koltukListele();
         tren3.koltukListele();
         plane1.koltukListele();
         plane2.koltukListele();
         plane3.koltukListele();
         plane4.koltukListele();
         
         for (int i = 0; i < 15; i++) {
              ReservationRepository.ekle(bus1,rota1);
              ReservationRepository.ekle(bus2,rota3);
              ReservationRepository.ekle(bus3,rota1);
              ReservationRepository.ekle(bus4,rota6);
              ReservationRepository.ekle(bus5,rota4);
              ReservationRepository.ekle(tren1,rota1);
              ReservationRepository.ekle(tren2,rota2);
              ReservationRepository.ekle(tren3,rota4); 
              ReservationRepository.ekle(plane1,rota2); 
              ReservationRepository.ekle(plane2,rota2); 
              ReservationRepository.ekle(plane3,rota1);
              ReservationRepository.ekle(plane4,rota1); 
        }
         

        
        Company A= CompanyRepository.ekle("A","A123" );        
        CompanyRepository.aracEkle(A.getId(),bus1);
        CompanyRepository.aracEkle(A.getId(),bus2);
        CompanyRepository.tripEkle(A.getId(), trip3);
 
        
       Company B= CompanyRepository.ekle("B","B123" );
       CompanyRepository.aracEkle(B.getId(),bus3);
       CompanyRepository.aracEkle(B.getId(),bus4);
       CompanyRepository.tripEkle(B.getId(), trip3);
       CompanyRepository.tripEkle(B.getId(), trip4);
       
       
       Company C= CompanyRepository.ekle("C","C123" );
       CompanyRepository.aracEkle(C.getId(),bus5);
       CompanyRepository.aracEkle(C.getId(),plane1);;
       CompanyRepository.aracEkle(C.getId(),plane2);
       CompanyRepository.tripEkle(C.getId(), trip4);
       CompanyRepository.tripEkle(C.getId(), trip5);
       
       
       Company D=CompanyRepository.ekle("D","D123" );
       CompanyRepository.aracEkle(D.getId(),tren1);
       CompanyRepository.aracEkle(D.getId(),tren2);
       CompanyRepository.aracEkle(D.getId(),tren3);
       CompanyRepository.tripEkle(D.getId(), trip1); 
       CompanyRepository.tripEkle(D.getId(), trip2); 
       
       
       Company F= CompanyRepository.ekle("F","F123" );
       CompanyRepository.aracEkle(F.getId(),plane3);
       CompanyRepository.aracEkle(F.getId(),plane4);
       CompanyRepository.tripEkle(F.getId(), trip6);
 
       
       
       
       
       
      
        ilk next = new ilk();
        next.setVisible(true);
       //next.dispatchEvent(new WindowEvent(next, WindowEvent.WINDOW_CLOSING));
    }
}
