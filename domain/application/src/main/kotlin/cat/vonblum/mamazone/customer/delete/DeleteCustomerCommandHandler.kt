package cat.vonblum.mamazone.customer.delete

import cat.vonblum.mamazone.customer.aggregate.CustomerId
import cat.vonblum.mamazone.customer.port.CustomerRepository
import cat.vonblum.mamazone.shared.domain.bus.command.CommandHandler

class DeleteCustomerCommandHandler(private val customerRepository: CustomerRepository) : CommandHandler {

    fun handle(command: DeleteCustomerCommand) = CustomerId(command.id).run {
        customerRepository.deleteById(this)
    }

}