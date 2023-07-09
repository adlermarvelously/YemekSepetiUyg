package com.merveadler.dto.request;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;




@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequestDto {
    @NotBlank(message = "Lütfen isminizi doldurunuz")
    @Size(min=3,max=20,message = "Kullanıcı adı en az 3 en fazla 20 karakter olabilir.")
    private String name;
    @Email
    @NotBlank(message = "Lütfen mail adresinizi giriniz")
    private String email;
    @NotBlank(message = "lütfen adresinizi doldurunuz")
    @Size(min=3,max=20,message = "Kullanıcı adı en az 3 en fazla 20 karakter olabilir.")
    private String address;
    @NotBlank(message = "Lütfen şifrenizi giriniz")
    @Size(min = 8, max = 64)
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=*!])(?=\\S+$).{8,}$"
            ,message = "Şifreniz en az büyük harf , küçük harf , bir sayı ve özel karakterden oluşmalıdır")

    private String password;

    private String repassword;
    @NotBlank(message = "Lütfen kart bilgilerinizi giriniz")
    @Size(min=3,max=20,message = "Kullanıcı adı en az 3 en fazla 20 karakter olabilir.")
    private String cardDetails;

    @Builder.Default
    private Double balance=0.0;

}