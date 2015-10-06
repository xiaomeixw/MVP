package xiongwei.mvp.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by xiongwei , An Android project Engineer.
 * Data : 2015-10-03  14:32
 * Describe:
 *      implementation  Parcelable is very simple
 *      1）class implements Parcelable ;
 *      2）overwrite --> writeToParcel() ;
 *      3）overwrite --> describeContents()，default return 0;
 *      4）Instantiated static internal objects  "CREATOR" ,Implementing an interface “Parcelable.Creator”.
 *
 *      In android studio there is a skill to easy implementation Parcelable
 *      1.list your bean field;
 *      2.use keyboard shortcuts : "alt+Enter" will implements methods,AS could help your overwrite -->  describeContents() and writeToParcel();
 *      3.Continue to use keyboard shortcuts : "alt+Enter" will Add Parcelable Implements,AS could help your to Instantiated static internal objects “CREATOR”。
 * Version : 1.0
 * Open Source ：MVP
 */
public class User implements Parcelable {

    private long id;
    private String name;
    private String url;
    private String email;
    private String login;
    private String location;
    private String avatarUrl;


    protected User(Parcel in) {
        id = in.readLong();
        name = in.readString();
        url = in.readString();
        email = in.readString();
        login = in.readString();
        location = in.readString();
        avatarUrl = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(id);
        dest.writeString(name);
        dest.writeString(url);
        dest.writeString(email);
        dest.writeString(login);
        dest.writeString(location);
        dest.writeString(avatarUrl);
    }
}
