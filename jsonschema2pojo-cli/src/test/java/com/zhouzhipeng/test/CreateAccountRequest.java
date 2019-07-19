
package com.zhouzhipeng.test;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreateAccountRequest implements Serializable
{

    @SerializedName("data")
    @Expose
    public CreateAccountRequest.Data data;
    private final static long serialVersionUID = -374062348110823173L;

    public CreateAccountRequest withData(CreateAccountRequest.Data data) {
        this.data = data;
        return this;
    }

    public static class Attributes implements Serializable
    {

        @SerializedName("account-type")
        @Expose
        public String accountType;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("authorized-signature")
        @Expose
        public String authorizedSignature;
        @SerializedName("owner")
        @Expose
        public CreateAccountRequest.Owner owner;
        private final static long serialVersionUID = 3322856468839718867L;

        public CreateAccountRequest.Attributes withAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }

        public CreateAccountRequest.Attributes withName(String name) {
            this.name = name;
            return this;
        }

        public CreateAccountRequest.Attributes withAuthorizedSignature(String authorizedSignature) {
            this.authorizedSignature = authorizedSignature;
            return this;
        }

        public CreateAccountRequest.Attributes withOwner(CreateAccountRequest.Owner owner) {
            this.owner = owner;
            return this;
        }

    }

    public static class Data implements Serializable
    {

        @SerializedName("type")
        @Expose
        public String type;
        @SerializedName("attributes")
        @Expose
        public CreateAccountRequest.Attributes attributes;
        private final static long serialVersionUID = 1348919452122749706L;

        public CreateAccountRequest.Data withType(String type) {
            this.type = type;
            return this;
        }

        public CreateAccountRequest.Data withAttributes(CreateAccountRequest.Attributes attributes) {
            this.attributes = attributes;
            return this;
        }

    }

    public static class Owner implements Serializable
    {

        @SerializedName("contact-type")
        @Expose
        public String contactType;
        @SerializedName("name")
        @Expose
        public String name;
        @SerializedName("email")
        @Expose
        public String email;
        @SerializedName("date-of-birth")
        @Expose
        public String dateOfBirth;
        @SerializedName("sex")
        @Expose
        public String sex;
        @SerializedName("tax-id-number")
        @Expose
        public String taxIdNumber;
        @SerializedName("tax-country")
        @Expose
        public String taxCountry;
        @SerializedName("primary-phone-number")
        @Expose
        public CreateAccountRequest.PrimaryPhoneNumber primaryPhoneNumber;
        @SerializedName("primary-address")
        @Expose
        public CreateAccountRequest.PrimaryAddress primaryAddress;
        private final static long serialVersionUID = -8439495166842174288L;

        public CreateAccountRequest.Owner withContactType(String contactType) {
            this.contactType = contactType;
            return this;
        }

        public CreateAccountRequest.Owner withName(String name) {
            this.name = name;
            return this;
        }

        public CreateAccountRequest.Owner withEmail(String email) {
            this.email = email;
            return this;
        }

        public CreateAccountRequest.Owner withDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public CreateAccountRequest.Owner withSex(String sex) {
            this.sex = sex;
            return this;
        }

        public CreateAccountRequest.Owner withTaxIdNumber(String taxIdNumber) {
            this.taxIdNumber = taxIdNumber;
            return this;
        }

        public CreateAccountRequest.Owner withTaxCountry(String taxCountry) {
            this.taxCountry = taxCountry;
            return this;
        }

        public CreateAccountRequest.Owner withPrimaryPhoneNumber(CreateAccountRequest.PrimaryPhoneNumber primaryPhoneNumber) {
            this.primaryPhoneNumber = primaryPhoneNumber;
            return this;
        }

        public CreateAccountRequest.Owner withPrimaryAddress(CreateAccountRequest.PrimaryAddress primaryAddress) {
            this.primaryAddress = primaryAddress;
            return this;
        }

    }

    public static class PrimaryAddress implements Serializable
    {

        @SerializedName("street-1")
        @Expose
        public String street1;
        @SerializedName("street-2")
        @Expose
        public String street2;
        @SerializedName("postal-code")
        @Expose
        public String postalCode;
        @SerializedName("city")
        @Expose
        public String city;
        @SerializedName("region")
        @Expose
        public String region;
        @SerializedName("country")
        @Expose
        public String country;
        private final static long serialVersionUID = -3448276938948008880L;

        public CreateAccountRequest.PrimaryAddress withStreet1(String street1) {
            this.street1 = street1;
            return this;
        }

        public CreateAccountRequest.PrimaryAddress withStreet2(String street2) {
            this.street2 = street2;
            return this;
        }

        public CreateAccountRequest.PrimaryAddress withPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public CreateAccountRequest.PrimaryAddress withCity(String city) {
            this.city = city;
            return this;
        }

        public CreateAccountRequest.PrimaryAddress withRegion(String region) {
            this.region = region;
            return this;
        }

        public CreateAccountRequest.PrimaryAddress withCountry(String country) {
            this.country = country;
            return this;
        }

    }

    public static class PrimaryPhoneNumber implements Serializable
    {

        @SerializedName("country")
        @Expose
        public String country;
        @SerializedName("number")
        @Expose
        public String number;
        @SerializedName("sms")
        @Expose
        public Boolean sms;
        private final static long serialVersionUID = -5896429166115712956L;

        public CreateAccountRequest.PrimaryPhoneNumber withCountry(String country) {
            this.country = country;
            return this;
        }

        public CreateAccountRequest.PrimaryPhoneNumber withNumber(String number) {
            this.number = number;
            return this;
        }

        public CreateAccountRequest.PrimaryPhoneNumber withSms(Boolean sms) {
            this.sms = sms;
            return this;
        }

    }

}
