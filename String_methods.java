class String_Methods {
    public static void main(String args[]){
        String str1 = new String();
        String str2 = new String();
        String str3 = new String();
        str1 = "java";
        str2 = "Lab";
        str3 = "jdk";
        System.out.print('\t'+"string 1 is "+str1+'\n');
        System.out.print('\t'+"string 2 is "+str2+'\n');
        System.out.print('\t'+"string 3 is "+str3+'\n');
        System.out.print('\t'+"Length of string 1 is "+str1.length()+'\n');
        System.out.print('\t'+"Character at 2nd index of string 1 is "+str1.charAt(2)+'\n');
        if(str1.equals(str3)){
            System.out.print('\t'+"string 1 and string 3 are equal including case senstivity. "+'\n');
        }
        else{
            System.out.print('\t'+"string 1 and string 3 are not equal. "+'\n');
        }
        if(str1.equalsIgnoreCase(str2)){
            System.out.print('\t'+"string 1 and string 2 are equal not including case senstivity. "+'\n');
        }
        else{
            System.out.print('\t'+"string 1 and string 2 are not equal. "+'\n');
        }
        System.out.print('\t'+"Does string 1 starts with s "+str1.startsWith("s")+'\n');
        System.out.print('\t'+"Does string 1 starts ends a "+str1.endsWith("a")+'\n');
        System.out.print('\t'+"comparing  string 1 and string 3 ignoring case sensitivity "+str1.compareToIgnoreCase(str3)+'\n');
        System.out.print('\t'+"comparing  string 1 and string 2 "+str1.compareTo(str2)+'\n');
        System.out.print('\t'+"Index of v in string 1 is "+str1.indexOf('v')+'\n');
        System.out.print('\t'+"substring of string 1 with begining index 2 is "+str1.substring(2)+'\n');
        System.out.print('\t'+"concating string 1 and string 2 is "+str1.concat(str2)+'\n');
        System.out.print('\t'+"replacing a with s in string 2 is "+str2.replace('a', 's')+'\n');
        System.out.print('\t'+"lower case of string 2 is "+str2.toLowerCase()+'\n');
        System.out.print('\t'+"Upper case of string 1 is "+str1.toUpperCase()+'\n');

    }
}
