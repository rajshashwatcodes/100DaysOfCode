class user:    # to create a class
    def __init__(self, user_id, username):
       self.id = user_id
       self.username = username
       self.followers = 0 
       self.followings = 0 

    def follow(self, user):
        user.followers += 1
        self.followings += 1

user_1 = user("001","Shashwat")

user_2 = user("002", "Raj")

user_1.follow(user_2)
print(user_1.followers)
print(user_1.followings)

print(user_2.followers)
print(user_2.followings)

