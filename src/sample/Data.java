package sample;

public class Data{
    String fname,  lname,  email,  address,  job, manager,  note,  performance,  phone,  salary,  status,id,sysID;

    public String  getId() { return id; }
    public void setid(String id) { this.id = id; }

    public String  getfname() { return fname; }
    public void setfname(String fname) { this.fname = fname; }

    public String  getlname() { return lname; }
    public void setlname(String lname) { this.lname = lname; }

    public String  getemail() { return email; }
    public void setemail(String email) { this.email = email; }

    public String  getaddress() { return address; }
    public void setfaddress(String address) { this.address = address; }

    public String  getjob() { return job; }
    public void setfjob(String job) { this.job = job; }

    public String  getmanager() { return manager; }
    public void setmanager(String manager) { this.manager = manager; }
    public String  getnote() { return note; }

    public void setnote(String note) { this.note = note; }

    public String  getfperformance() { return performance; }
    public void setperformance(String performance) { this.performance = performance; }
    public String  getphone() { return phone; }
    public void setphone(String phone) { this.phone = phone; }
    public String  getsalary() { return salary; }
    public void setsalary(String salary) { this.salary = salary; }
    public String  getstatus() { return status; }
    public void setstatus(String status) { this.status = status; }

    public String  getsysID() { return sysID; }
    public void setsysID(String sysID) { this.sysID = sysID; }

    public  String getdata(){
        String fname = "",  lname = "",  email ="",  address="",  job="", manager="",  note="",  performance="",  phone="",  salary="",  status="",id="",sysID="";

String pattern = "u_number:%s,u_email:%s,u_address:%s,u_job:%s,u_last_name:%s,sys_id: %s, u_first_name:%s, u_salary:%s,u_performance:%s,u_phone_number:%s,u_status:%s,u_manager:%s, u_notes:%s";
        //"{\"u_first_name\":\"%s\",\"u_last_name\":\"%s\",\"u_email\":\"%s\",\"u_address\":\"%s\",\"u_job\":\"%s\",\"u_manager\":\"%s\",\"u_notes\":\"%s\",\"u_performance\":\"%s\",\"u_phone\":\"%s\",\"u_salary\":\"%s\",\"u_status\":\"%s\"}";

        return String.format(pattern,id ,email, address,job,lname,sysID,fname, salary,performance,phone,status,manager,note);
    }




}
