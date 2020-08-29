/* Amplify Params - DO NOT EDIT
	
Amplify Params - DO NOT EDIT */

package example;
        
     public class Magazine {
        Integer id;
        String title;

        public Integer getId() {
            return this.id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getTitle() {
            return this.title;
        }

        public void setTitle(String greetings) {
            this.title = greetings;
        }

        public Magazine(String title) {
            this.title = title;
            this.id = 1;
        }
    }