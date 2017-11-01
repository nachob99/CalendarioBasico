
/**
 * Write a description of class CalendarioBasico here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // instance variables - replace the example below with your own
    private int dia;
    private int mes;
    private int ano;
    

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        dia = 0;
        mes = 0;
        ano = 0;
    }
    /**
     * Avanzar de fecha dia a dia
     */
    public void avanzarFecha()
    {
        if(dia <31)
        {dia= dia + 1;}
        if(dia ==31)
        {dia = 1;
         mes = mes + 1;
        }
        if(mes ==13)
        {mes = 1;
         ano = ano +1;
        }
    }
    
    /**
     * Fijar fecha
     */
    public void fijarFecha(int day, int month, int year)
    {
        dia = day;
        mes = month;
        ano = year;
    }
    
    /**
     * Nos muestra la fecha
     */
    public String mostrarFecha()
    {
        String dosCifrDia = String.valueOf(dia);
        String dosCifrMes = String.valueOf(mes);
        String dosCifrAno = String.valueOf(ano);
        if(dosCifrDia.length()<2)
        {
            dosCifrDia = "0" + String.valueOf(dia);
        }
        if(dosCifrMes.length()<2)
        {
            dosCifrMes = "0" + String.valueOf(mes);
        }
        return dosCifrDia + "-" + dosCifrMes +"-" + dosCifrAno.substring(2,4);
    }
}
