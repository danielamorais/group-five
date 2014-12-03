#include <AcceleroMMA7361.h>

AcceleroMMA7361 accelero;
int x;
int y;
int z;
String tmpu, tmpx, tmpy, tmpz, us;
int antu, antx, anty, antz, proxu, proxx, proxy, proxz; 
int led_1 = 2;
int led_2 = 3;
int BUZZER = 5; // Ligar o buzzer (Som) no pino 5 
boolean testex, testez, testey; 
void setup(){
  Serial.begin(9600);
  testex = false;
  testez = false;
  testey = false;
  pinMode(BUZZER,OUTPUT);
  pinMode(led_1,OUTPUT);
  pinMode(led_2,OUTPUT);
  pinMode(10, OUTPUT);
  accelero.begin(8, 7, 9, 6, A0, A1, A2); //13 (branco, 8) 12 (marrom, 7) 11 (roxo, 9) 10 (laranja, 6)
  accelero.setARefVoltage(5);                   
  accelero.setSensitivity(HIGH);                   
  accelero.calibrate();
  Serial.println("");
}
 
void loop(){  
  	
  antu = analogRead(A3);
  if(antu <= 300){
us = "Solo Seco";
Serial.println(us);
}
if((antu > 300)&&(antu <= 700)){
us = "Solo Umido";
Serial.println(us);
}
if((antu > 700)&&(antu <= 950)){
us = "Super Umido";
Serial.println(us);
}
if(antu > 950){
us = "Submerso";
Serial.println(us);
}
  tmpu = "u" + (String)analogRead(A3);
	
  antx = accelero.getXRaw();
  tmpx = "x" + (String)accelero.getXRaw(); 

  anty = accelero.getYRaw();
  tmpy = "y" + (String)accelero.getYRaw(); 

  antz = accelero.getZRaw();
  tmpz = "z" + (String)accelero.getZRaw(); 

 delay(500);
 //verificar novos valores
 proxu = analogRead(A3); 
 proxx = accelero.getXRaw();
 int absolutox = abs(abs(proxx) - abs(antx));
 proxy = accelero.getYRaw();
 int absolutoy = abs(abs(proxy) - abs(anty));
 proxz = accelero.getZRaw();
 int absolutoz = abs(abs(proxz) - abs(antz));
 
 if(absolutox >= 10 && absolutox <= 20){
  digitalWrite(led_1, HIGH);
  testex = false;
  testey = false;
  testez = false;
}
if(absolutoz >= 10 && absolutoz <= 20){
  digitalWrite(led_1, HIGH);
  testex = false;
  testey = false;
  testez = false;
}
if(absolutoy >= 10 && absolutoy <= 20){
  digitalWrite(led_1, HIGH);
  digitalWrite(led_2, LOW);
  testex = false;
  testey = false;
  testez = false;
}
//apagar
if(absolutox < 10 && absolutoz < 10 && absolutoy < 10){
 digitalWrite(led_1, LOW); 
 digitalWrite(led_2, LOW);
 testex = false;
  testey = false;
  testez = false;
}
if(absolutox > 20){
  digitalWrite(led_1, HIGH);
  digitalWrite(led_2, HIGH);
  testex = true; 
}
if(absolutoz > 20){
  digitalWrite(led_1, HIGH);
  digitalWrite(led_2, HIGH);
  testez = true;
}
if(absolutoy > 20){
  digitalWrite(led_1, HIGH);
  digitalWrite(led_2, HIGH);
  testey = true;
}
if(testex==true || testez==true || testey==true){
  tone(5,300,300); //aqui sai o som   
  delay(500);   
  tone(5,300,300); //aqui sai o som   
  delay(500);
 tone(5,300,300); //aqui sai o som   
  delay(500);
 tone(5,300,300); //aqui sai o som   
  delay(500);  
}
Serial.println(tmpu);
delay(500);
Serial.println(tmpx);
delay(500);
Serial.println(tmpy);
delay(500);
Serial.println(tmpz);
}
