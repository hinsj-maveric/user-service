package com.maveric.userservice.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(value = "user-service", url = "http://localhost:3010/api/v1")
public interface FeignUserService {

    @DeleteMapping("customers/{customerId}/accounts")
    public ResponseEntity<String> deleteAllAccount(@PathVariable String customerId,
                                                   @RequestHeader(value = "userid") String headerUserId);
}
