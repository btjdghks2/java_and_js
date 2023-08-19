package com.example.SpringConnection.startbean;

import com.example.SpringConnection.domain.Member;
import com.example.SpringConnection.domain.Product;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class InitDb {

    private final InitService initService;


    public void init() {
        initService.dbInit1();
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService {

        private final EntityManager em;


        public void dbInit1() {
            Member member = createMember(01L,"userA","1111",0101111);
            em.persist(member);

            Product product = createProduct(02L,"productA","productAA",123,30);
            em.persist(product);


        }

        private Member createMember(Long id, String userA, String number1, int number2) {
            Member member =new Member();
            member.setId(id);
            member.setMemberid(userA);
            member.setMemberpasswd(number1);
            member.setPhonenumber(number2);
            return member;

        }


        private Product createProduct(Long id, String productA, String productAA, int price, int count) {
            Product product = new Product();
            product.setId(id);
            product.setProductname(productA);
            product.setProductcontent(productAA);
            product.setPrice(price);
            product.setCount(count);
            return null;
        }



    }
}
