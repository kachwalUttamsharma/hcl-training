<<<<<<< HEAD
package com.hcl.homework;

public class StringMethods {

public void Method1(String s,int n){

if(n>s.length()){
System.out.println("Out of Range");
}
char[] c = s.toCharArray();
for(int i=0;i<n;i++) {
if(i==n){
System.out.println(c[n]);

}
}
}	

public void Method2(String s){
int l=0;
char[] c = s.toCharArray();
for (char i : c) {
l++;
}
System.out.println(l);
}


public void Method3(String s, int first, int last){
char[] c = s.toCharArray();
for(int i=first;i<=last;i++){
System.out.print(c[i]);
}
}

public void Method4(String s1, String s2){
int c=0;
int l1 = s1.length();
int l2 = s2.length();
if(l1!=l2){
System.out.println("Not Equal");
}else{
char[] c1 = s1.toCharArray();
char[] c2 = s2.toCharArray();
for(int i=0;i<l1;i++){
if(c1[i]==c2[i]){
c++;
}else{
System.out.println("Not Equal");
}
}if(c==l1){
System.out.println("   Equal");
}
}
}

public void Method5(String s){
int n;
char[] c = s.toCharArray();
for(int i=0;i<s.length();i++){
n=c[i];
if(n>96){
n=n-32;
c[i]=(char)('0'+n-48);
}
}System.out.println(c);
}

public void Method6(String s){
int n;
char[] c = s.toCharArray();
for(int i=0;i<s.length();i++){
n=c[i];
if(n<96){
n=n+32;
c[i]=(char)('0'+n-48);
}
}System.out.println(c);
}



public static void main(String[] args) {
StringMethods z = new StringMethods();
z.Method1("gfdsgsdfhg", 19);
z.Method2("dfgfdsh");
z.Method3("jdhfjdsf", 2, 6);
z.Method4("asdfg", "asdfg");
z.Method5("asdFDG");
z.Method6("asdFDG");

}
}

=======
package com.hcl.homework;

public class StringMethods {

public void Method1(String s,int n){

if(n>s.length()){
System.out.println("Out of Range");
}
char[] c = s.toCharArray();
for(int i=0;i<n;i++) {
if(i==n){
System.out.println(c[n]);

}
}
}	

public void Method2(String s){
int l=0;
char[] c = s.toCharArray();
for (char i : c) {
l++;
}
System.out.println(l);
}


public void Method3(String s, int first, int last){
char[] c = s.toCharArray();
for(int i=first;i<=last;i++){
System.out.print(c[i]);
}
}

public void Method4(String s1, String s2){
int c=0;
int l1 = s1.length();
int l2 = s2.length();
if(l1!=l2){
System.out.println("Not Equal");
}else{
char[] c1 = s1.toCharArray();
char[] c2 = s2.toCharArray();
for(int i=0;i<l1;i++){
if(c1[i]==c2[i]){
c++;
}else{
System.out.println("Not Equal");
}
}if(c==l1){
System.out.println("   Equal");
}
}
}

public void Method5(String s){
int n;
char[] c = s.toCharArray();
for(int i=0;i<s.length();i++){
n=c[i];
if(n>96){
n=n-32;
c[i]=(char)('0'+n-48);
}
}System.out.println(c);
}

public void Method6(String s){
int n;
char[] c = s.toCharArray();
for(int i=0;i<s.length();i++){
n=c[i];
if(n<96){
n=n+32;
c[i]=(char)('0'+n-48);
}
}System.out.println(c);
}



public static void main(String[] args) {
StringMethods z = new StringMethods();
z.Method1("gfdsgsdfhg", 19);
z.Method2("dfgfdsh");
z.Method3("jdhfjdsf", 2, 6);
z.Method4("asdfg", "asdfg");
z.Method5("asdFDG");
z.Method6("asdFDG");

}
}

>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
