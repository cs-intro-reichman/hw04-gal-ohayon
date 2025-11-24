     public static void detectAndPrint(String[] sentences, String[] keywords) {
        int i=0;

        while(i<sentences.length){
        String sentence =keywords[i].toLowerCase();
        String lowsentences=sentences.toLowerCase();
        int k=0;
        while (k<keywords.length){
        String lowerKeyword = keywords[k].toLowerCase();

          if(lowsentences.contains(lowerKeyword))
          {
            System.out.println(sentence);
            break;
          }
          k++;
        }
          i++;
     }
    }