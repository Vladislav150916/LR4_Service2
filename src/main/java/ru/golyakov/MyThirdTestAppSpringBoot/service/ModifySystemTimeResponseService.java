package ru.golyakov.MyThirdTestAppSpringBoot.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.golyakov.MyThirdTestAppSpringBoot.model.Response;
import ru.golyakov.MyThirdTestAppSpringBoot.util.DateTimeUnit;

import java.util.Date;

@Service
@Qualifier("ModifySystemTimeResponseService")
public class ModifySystemTimeResponseService implements ModifyResponseService{

    @Override
    public Response modify(Response response) {

        response.setSystemTime(DateTimeUnit.getCustomFormat().format(new Date()));

        return response;
    }
}
