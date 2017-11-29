void secuencia (){
  for (int i = 0; i < 3; i++) {
      digitalWrite(O1Lp, HIGH);
      digitalWrite(O1Ls, HIGH);
      digitalWrite(O1Lg, HIGH);
      delay(500);
      digitalWrite(O1Lp, LOW);
      digitalWrite(O1Ls, LOW);
      digitalWrite(O1Lg, LOW);
      delay(5000);
      
  }
}

