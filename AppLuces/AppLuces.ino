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
boolean sec = false;

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
  Serial.begin(9600);
}

void loop()
{
  if(Serial.available()) 
    entrada = Serial.readStringUntil('\n');

  if(entrada=="O1Lp0"){
    digitalWrite(O1Lp, LOW);
  }
  if(entrada=="O1Lp1"){
    digitalWrite(O1Lp, HIGH);
  }
  if(entrada=="O1Ls0"){
    digitalWrite(O1Ls, LOW);
  }
  if(entrada=="O1Ls1"){
    digitalWrite(O1Ls, HIGH);
  } 
  if(entrada=="O1Lg0"){
    digitalWrite(O1Lg, LOW);
  }
  if(entrada=="O1Lg1"){
    digitalWrite(O1Lg, HIGH);
  }
  if(entrada=="O2Lp0"){
    digitalWrite(O2Lp, LOW);
  }
  if(entrada=="O2Lp1"){
    digitalWrite(O2Lp, HIGH);
  }
  if(entrada=="O2Ls0"){
    digitalWrite(O2Ls, LOW);
  }
  if(entrada=="O2Ls1"){
    digitalWrite(O2Ls, HIGH);
  } 
  if(entrada=="O2Lg0"){
    digitalWrite(O2Lg, LOW);
  }
  if(entrada=="O2Lg1"){
    digitalWrite(O2Lg, HIGH);
  }
  if(entrada=="O3Lp0"){
    digitalWrite(O3Lp, LOW);
  }
  if(entrada=="O3Lp1"){
    digitalWrite(O3Lp, HIGH);
  }
  if(entrada=="O3Ls0"){
    digitalWrite(O3Ls, LOW);
  }
  if(entrada=="O3Ls1"){
    digitalWrite(O3Ls, HIGH);
  } 
  if(entrada=="O3Lg0"){
    digitalWrite(O3Lg, LOW);
  }
  if(entrada=="O3Lg1"){
    digitalWrite(O3Lg, HIGH);
  }
  if(entrada=="secuencia"){
    sec = true;
  }
  if(entrada=="apagar"){
    sec = false;
  }

  if(sec==true) secuencia();
}
