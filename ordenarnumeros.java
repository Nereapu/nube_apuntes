public ordenarnumeros{
  public int[] ordenar(int[] num)
  {
  boolean hay cambio=true;
  while(hayCambio==true){
    for(int i=1; i<num.lenght;i++)
    {
      if(num[i]>num[i-1])
      {
        hayCmabio=false
        int menor=num[i]
        int mayor=num[i-1];
        num[i-1]=menor;
        num[i]=mayor;
        hayCambio=true;
      }
    }
  }
}
