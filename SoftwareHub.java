package com.xworkz.playstoreapp.hub;

import com.xworkz.playstoreapp.application.Application;

import java.util.Arrays;

public class SoftwareHub {

    //Application application[] = new Application[2];
    Application application[];
    public SoftwareHub(int size) {
        application = new Application[size];
    }
    int index;
    int id=1;

    public boolean addApplications(Application application) {
        System.out.println("invoking add application");
        System.out.println(application);
        boolean isAdded = false;
        if (application != null) {
            application.setAppId(id++);
            this.application[index++] = application;
            isAdded = true;
        }
        return isAdded;
    }

    public void getAllApplication() {
        System.out.println("list of application details are ");
        for (int index = 0; index < application.length; index++) {
            System.out.println((application[index]));
            if (application[index] != null) {
                System.out.println(application[index].getAppId() + " " + application[index].getSizeInMb() + " " + application[index].getAppName() + " " + application[index].getAppType() + " " + application[index].getAppVersion() + " " + application[index].getReleaseDate() + " " + application[index].getCompanyName());
            }
        }
    }

    public Application getApplicationByName(String appName) {
        Application application1 = null;

        System.out.println("invoking the app application by name method " + appName);
        System.out.println(application1);

        for (int appIndex = 0; appIndex < application.length; appIndex++) {
            System.out.println("hhhhhhhhh" + application[appIndex]);//null
            if (application[appIndex] != null) {
                if (application[appIndex].getAppName().equals(appName)) {
                    application1 = application[appIndex];
                    System.out.println(application1 + "hsgd");
                    System.out.println("Application found .... please collect in the executor  " + application1);
                }
            }
        }

        return application1;
    }


    public Application getApplicationById(int appId) {
        Application app2 = null;
        System.out.println("invoking the application by id method ");
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex] != null) {
                if (application[appIndex].getAppId() ==
                        appId) {
                    app2 = application[appIndex];
                    System.out.println("Application found by id .... please collect in the executor  ");
                }
            }
        }
        return app2;

    }

    public Application getApplicationByAppType(String appType) {
        Application app3 = null;
        System.out.println("invoking the app application by app type method " + application.length);
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex] != null) {
                if (application[appIndex].getAppType() == appType) {
                    app3 = application[appIndex];
                    System.out.println("Application found by app type .... please collect in the executor  ");
                    return app3;
                }
            }
        }
        return app3;
    }

    public String getApplicationNameByType(String appType) {

        String appName = null;
        System.out.println("invoking the app application name by type method ");
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex] != null) {
                if (application[appIndex].getAppType().equals(appType)) {
                    appName = application[appIndex].getAppName();
                    System.out.println("Application name found by type .... please collect in the executor  ");
                }
            }
        }
        return appName;
    }

    public String getApplicationTypeByName(String appName) {
        String appType = null;
        System.out.println("invoking the app application type by name method ");
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex] != null) {
                if (application[appIndex].getAppName().equals(appName)) {
                    appType = application[appIndex].getAppType();
                    System.out.println("Application type found by name .... please collect in the executor  ");
                }
            }
        }
        return appType;
    }

    public double getApplicationSizeByName(String appName) {
        double sizeInMb = 0;
        System.out.println("invoking the app application size by name method ");
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex] != null) {
                if (application[appIndex].getAppName() == appName) {
                    sizeInMb = application[appIndex].getSizeInMb();
                    System.out.println("Application size found by name .... please collect in the executor  ");
                }
            }
        }
        return sizeInMb;
    }

    public String getApplicationCompanyNameByName(String name) {
        String companyName = null;
        System.out.println("invoking the app application company name found by name method ");
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex] != null) {
                if (application[appIndex].getAppName().equals(name)) {
                    companyName = application[appIndex].getCompanyName();
                    System.out.println("Application company name found by name .... please collect in the executor  ");
                }
            }
        }
        return companyName;
    }


    public boolean updateAppVersionByAppName(String updatedVersion, String existingAppName) {
        boolean isVersionUpdated = false;
        System.out.println("invoking app version by app name method");
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex] != null)
                if (application[appIndex].getAppName() == existingAppName) {
                    application[appIndex].setAppVersion(updatedVersion);
                    isVersionUpdated = true;

                    System.out.println("updated app version by app name .... please collect in the executor  ");
                }
        }


        return isVersionUpdated;

    }


    public boolean updateCompanyNameById(String updatedCompanyName, int existingId) {
        boolean isCompanyNameUpdated = false;
        System.out.println("invoking update company name by id method");
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex] != null)
                if (application[appIndex].getAppId() == existingId) {
                    application[appIndex].setCompanyName(updatedCompanyName);
                    isCompanyNameUpdated = true;

                    System.out.println("updated company name by Id .... please collect in the executor  ");
                }


        }


        return isCompanyNameUpdated;
    }





    private void getAllNewApplication(Application application[]){

        System.out.println("list of new app post delete");
        for (int appIndex = 0; appIndex < application.length;appIndex++) {
            System.out.println(application[appIndex].getAppId() + " " + application[appIndex].getSizeInMb() + " " + application[appIndex].getAppName() + " " + application[appIndex].getAppType() + " " + application[appIndex].getAppVersion() + " " + application[appIndex].getReleaseDate() + " " + application[appIndex].getCompanyName());


        }
    }
    public boolean deleteApplicationByAppName(String appName) {
        boolean isApplicationDeleted = false;
        System.out.println("invoking deleteApplicationByAppName");
        int appIndex, newIndex;

        //Application application1[] = new Application[this.application.length - 1];
        for (appIndex = 0, newIndex = 0; appIndex < this.application.length; appIndex++) {
            //candy crush !=candy crush
//            System.out.println("...............................        "+application[appIndex].getAppName()+"                 "+appName);
            if (application[appIndex].getAppName() != appName) {
                application[newIndex++] = application[appIndex];
                System.out.println("given app name deleted");
                isApplicationDeleted=true;

            }
        }
//        application = Arrays.copyOf(application, newIndex);
//        getAllNewApplication(application);

        return isApplicationDeleted;
    }


}



