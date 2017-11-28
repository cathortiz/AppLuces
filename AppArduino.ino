int O1Lp = 2;
int O1Ls = 3;
int O1Lg = 4;
int O2Lp = 5;
int O2Ls = 6;
int O2Lg = 7;
int O3Lp = 8;
int O3Ls = 9;
int O3Lg = 10;
String entrada = "";

void setup()
{
  pinMode(O1Lp, OUTPUT);
  pinMode(O1Ls, OUTPUT);
  pinMode(O1Lg, OUTPUT);
  pinMode(O2Lp, OUTPUT);
  pinMode(O2Ls, OUTPUT);
  pinMode(O2Lg, OUTPUT);
  pinMode(O3Lp, OUTPUT);
  pinMode(O3Ls, OUTPUT);
  pinMode(O3Lg , OUTPUT);
}

void loop()
{
    if(Serial.available()) 
      entrada = Serial.readStringUntil('\n');

  if(entrada=="O1Lp0"){
    DigitalWrite(O1Lp, LOW);
  }
  if(entrada=="O1Lp1") {
    DigitalWrite(O1Lp, HIGH);
  }
  if(entrada=="O1Ls0"){
    DigitalWrite(O1Lp, LOW);
  }
  if(entrada=="O1Ls1") {
    DigitalWrite(O1Lp, HIGH);
  } 
  if(entrada=="O1Lg0"){
    DigitalWrite(O1Lp, LOW);
  }
  if(entrada=="O1Lg1") {
    DigitalWrite(O1Lp, HIGH);
  }
  if(entrada=="O2Lp0"){
    DigitalWrite(O2Lp, LOW);
  }
  if(entrada=="O2Lp1") {
    DigitalWrite(O2Lp, HIGH);
  }
  if(entrada=="O2Ls0"){
    DigitalWrite(O2Lp, LOW);
  }
  if(entrada=="O2Ls1") {
    DigitalWrite(O2Lp, HIGH);
  } 
  if(entrada=="O2Lg0"){
    DigitalWrite(O2Lp, LOW);
  }
  if(entrada=="O2Lg1") {
    DigitalWrite(O2Lp, HIGH);
  }
  if(entrada=="O3Lp0"){
    DigitalWrite(O3Lp, LOW);
  }
  if(entrada=="O3Lp1") {
    DigitalWrite(O3Lp, HIGH);
  }
  if(entrada=="O3Ls0"){
    DigitalWrite(O3Lp, LOW);
  }
  if(entrada=="O3Ls1") {
    DigitalWrite(O3Lp, HIGH);
  } 
  if(entrada=="O3Lg0"){
    DigitalWrite(O3Lp, LOW);
  }
  if(entrada=="O3Lg1") {
    DigitalWrite(O3Lp, HIGH);
  }

  entrada = "";
}