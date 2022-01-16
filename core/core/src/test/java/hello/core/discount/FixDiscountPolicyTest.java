package hello.core.discount;

import hello.core.member.Member;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FixDiscountPolicyTest implements DiscountPolicy{

    @Override
    public int discount(Member member, int price) {
        return 0;
    }
}