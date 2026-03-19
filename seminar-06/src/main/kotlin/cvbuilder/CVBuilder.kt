package cvbuilder

import cvbuilder.models.CV
import cvbuilder.models.Contact

class CVBuilder {
    var cvContact: Contact = Contact()

    fun contact(init: ContactBuilder.() -> Unit) {
        val builder = ContactBuilder()
        builder.init()
        cvContact = builder.build()
    }

    fun build(): CV {
        return CV(contact = cvContact)
    }

    companion object {
        fun cv(init: CVBuilder.() -> Unit): CV {
            val builder = CVBuilder()
            builder.init()
            return builder.build()
        }
    }
}

class ContactBuilder {
    var contact: Contact = Contact()
    var name: String = ""
    var email: String = ""
    var phoneNumber: String = ""

    fun build(): Contact = Contact(name, email, phoneNumber)
}