package Core.model;

public class Agency extends FeedModel {
        private String agencyName;
        private String agencyUrl;
        private String agencyTimeZone;
        private String agencyLang;
        private String agencyPhone;
        public Agency(){
            super("");
        }
        public Agency(String agencyName, String agencyUrl, String agencyTimeZone, String agencyLang, String agencyPhone) {
            super("");
            this.agencyName = agencyName;
            this.agencyUrl = agencyUrl;
            this.agencyTimeZone = agencyTimeZone;
            this.agencyLang = agencyLang;
            this.agencyPhone = agencyPhone;
        }
        public String getAgencyName() {
            return agencyName;
        }
        public void setAgencyName(String agencyName) {
            this.agencyName = agencyName;
        }
        public String getAgencyUrl() {
            return agencyUrl;
        }
        public void setAgencyUrl(String agencyUrl) {
            this.agencyUrl = agencyUrl;
        }
        public String getAgencyTimeZone() {
            return agencyTimeZone;
        }
        public void setAgencyTimeZone(String agencyTimeZone) {
            this.agencyTimeZone = agencyTimeZone;
        }
        public String getAgencyLang() {
            return agencyLang;
        }
        public void setAgencyLang(String agencyLang) {
            this.agencyLang = agencyLang;
        }
        public String getAgencyPhone() {
            return agencyPhone;
        }
        public void setAgencyPhone(String agencyPhone) {
            this.agencyPhone = agencyPhone;
        }
        @Override
        public String toString() {
            return "Agency{" +
                    "agencyName='" + agencyName + '\'' +
                    ", agencyUrl='" + agencyUrl + '\'' +
                    ", agencyTimeZone='" + agencyTimeZone + '\'' +
                    ", agencyLang='" + agencyLang + '\'' +
                    ", agencyPhone='" + agencyPhone + '\'' +
                    '}';
        }
    }