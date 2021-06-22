package com.lxisoft.movie;
import com.lxisoft.director.*;

public class ScriptWriter{

  public void writeScript() throws IOException{
        Director d-new Director();
        File f1=new File("C:\\Users\\Nisha\\Desktop\\work\\Movie Script\\src\\com\\lxisoft\\script\\script.csv");
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String s;



        while((s=br.readLine())!=null)   //Reading Content from the file
        {
           words=s.split(";");

          // System.out.println(size); //Split the word using space
          //  System.out.println(words[i]);
            if (words[1].equals("comedy") || words[1].equals("romantic") || words[1].equals("emotional")){
              script.add(new Script());
            //  System.out.println(script.size());
              for(int i=script.size()-1;i<script.size();i++){
              script.get(i).setGenre(words[1]);
              script.get(i).setCharacter(words[2]);
              script.get(i).setConversation(words[3]);
              //System.out.println(script.get(i).getGenre());
              //System.out.println(script.get(i).getConversation());
            }
          }



            }


fr.close();

/*  System.out.println("How many actors?");
n=sc.nextInt();
System.out.println("ENTER THE Actor's name : ");
for(int i=0;i<=n;i++){
  name[i]=sc.nextLine();
}*/


  System.out.println("********************************");
  System.out.println("********************************");
  System.out.println("*********"+movieName+"********");
  System.out.println("********************************");
  System.out.println("********************************");
  System.out.println("********************************");
  System.out.println("DIRECTOR :     ==>    "+d.directorName);
  System.out.println("********************************");

  System.out.println("********************************\n\n");
  System.out.println("**********************************");
  System.out.println("***********************************");
  System.out.println("*************SCENE1****************");
  System.out.println("***********************************");
  System.out.println("***********************************");


                  for (int i=0;i<script.size();i++)
                  {

                  //  System.out.println(script.get(i).getCharacter());
                    if(script.get(i).getGenre().equals(input1)){

                     System.out.println(script.get(i).getCharacter()+" "+script.get(i).getConversation());
                    }

    }
    int n=randNum();
    //System.out.println(n);
    for(int i=0;i<n;i++){
      //  System.out.println(n);
     if(!script.get(i).getGenre().equals(input1)){
       //System.out.println(n);
       System.out.println(script.get(i).getCharacter()+"  "+script.get(i).getConversation());
     }
    }
        }
        public int randNum(){
        		int s=script.size();
        		int random=(int)(Math.random()*s);
                        return random;
        	}

}
