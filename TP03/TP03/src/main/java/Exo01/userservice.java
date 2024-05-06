package Exo01;

public class userservice {

    userrepository ur;
        public utilisateur getuserbyid(long id)
        {
            return ur.findUserById(id) ;
        }
        void setur(userrepository userr)
        {
            this.ur=userr;
        }


}
