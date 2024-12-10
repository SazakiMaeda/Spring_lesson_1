package com.sazakimaeda.spring.springMVC.crud.dao;

import com.sazakimaeda.spring.springMVC.crud.models.SmartPhone;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TelephoneDao {
    private static int COUNT;
    private static List<SmartPhone> telephone;
    {
        telephone = new ArrayList<SmartPhone>();

        telephone.add(new SmartPhone("SAMSUNG", COUNT++));
        telephone.add(new SmartPhone("IPHONE", COUNT++));
        telephone.add(new SmartPhone("XIAOMI", COUNT++));
        telephone.add(new SmartPhone("HUAWEI", COUNT++));
    }

    public List<SmartPhone> indexPhone() {
        return telephone;
    }

    public SmartPhone showPhone(int id) {
        return telephone.stream().filter(smartPhone -> smartPhone.getId() == id).findAny().orElse(null);
    }
}
