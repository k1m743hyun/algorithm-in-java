package org.thkim0022.code;

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}