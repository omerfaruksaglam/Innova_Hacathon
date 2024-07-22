package com.innova.expense_tracker.Auth.Controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/innova/auth")
    @RequiredArgsConstructor
    public class AuthController {
        private final AuthenticationService service;

        @PostMapping("/register")
        public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){
            return ResponseEntity.ok(service.register(request));
        }

        @PostMapping("/authenticate")
        public ResponseEntity<AuthResponseWithInfos> register(@RequestBody AuthenticationRequest request){

            return ResponseEntity.ok(service.authenticate(request));
        }


        @PostMapping("/getbolmfacuni")
        public BolmFacUni getAll(@RequestBody GetById getById) {
            return service.getBolFacUni(getById);
        }

}
