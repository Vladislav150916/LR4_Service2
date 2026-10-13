package ru.golyakov.MyThirdTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.golyakov.MyThirdTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {

    Response modify(Response response);

}
