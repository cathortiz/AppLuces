void secuencia (){
  for (int i = 0; i < 3; i++) {
      digitalWrite(O3Lp, HIGH);
      digitalWrite(O3Ls, HIGH);
      digitalWrite(O3Lg, HIGH);
      digitalWrite(O2Ls, HIGH);
      delay(500);
      digitalWrite(O3Lp, LOW);
      digitalWrite(O3Ls, LOW);
      digitalWrite(O3Lg, LOW);
      digitalWrite(O2Ls, LOW);
      delay(500);
  }
  digitalWrite(O3Lp, HIGH);
  digitalWrite(O3Ls, HIGH);
  digitalWrite(O3Lg, HIGH);
  digitalWrite(O1Lp, HIGH);
  digitalWrite(O1Ls, HIGH);
  digitalWrite(O1Lg, HIGH);
  digitalWrite(O2Ls, HIGH);
  delay(500);
  digitalWrite(O3Lp, LOW);
  digitalWrite(O3Ls, LOW);
  digitalWrite(O3Lg, LOW);
  digitalWrite(O1Lp, LOW);
  digitalWrite(O1Ls, LOW);
  digitalWrite(O1Lg, LOW);
  digitalWrite(O2Ls, LOW);
  delay(500);

  digitalWrite(O2Lp, HIGH);
  digitalWrite(O2Ls, HIGH);
  digitalWrite(O2Lg, HIGH);
  delay(500);
  digitalWrite(O2Lp, LOW);
  digitalWrite(O2Ls, LOW);
  digitalWrite(O2Lg, LOW);
  delay(500);

  digitalWrite(O1Lp, HIGH);
  digitalWrite(O1Ls, HIGH);
  digitalWrite(O1Lg, HIGH);
  digitalWrite(O2Lg, HIGH);
  digitalWrite(O3Lg, HIGH);
  delay(500);
  digitalWrite(O1Lp, LOW);
  digitalWrite(O1Ls, LOW);
  digitalWrite(O1Lg, LOW);
  digitalWrite(O2Lg, LOW);
  digitalWrite(O3Lg, LOW);
  delay(2000);
}

