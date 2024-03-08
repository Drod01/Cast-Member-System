
public class Show {

//instance variables

private String title;

private int castNumber;

private CastMember[] castMembers;

private int count = 0;



public Show(String title, int castNumber) {

this.title = title;

this.castNumber = castNumber;

castMembers = new CastMember[castNumber];

}

@Override

public String toString() {

String data = "Show: ";

data = data + title+"\n";

data = data + castNumber+" cast members:\n";

for(int i=0;i<count;i++) {

data = data + castMembers[i];

}

return data;

}


public void addCastMember(CastMember castMember) {

castMembers[count] = castMember;

count++;

}



public String getTitle() {

return title;

}



public void setTitle(String title) {

this.title = title;

}



public int getCastNumber() {

return castNumber;

}


public CastMember[] getCastMembers() {

return castMembers;

}



public void setCastMembers(CastMember[] castMembers) {

this.castMembers = castMembers;

}

}