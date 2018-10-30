package restapijwt

class BootStrap {

    def init = { servletContext ->

        5.times { new Postcode(name: "abcd").save() }


        Role admin = Role.create()
        admin.authority = "ROLE_ADMIN"
        admin.save()
        User user = User.create()
        user.username = "username"
        user.password = "password"
        user.save()
        UserRole.create(user, admin, true)

    }
    def destroy = {
    }
}
