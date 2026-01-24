// ==================== VOUCHER DATA ====================
const vouchers = [
    {
        id: 1,
        code: 'BAKE10',
        name: 'Giảm 10% cho bánh kem',
        description: 'Giảm giá 10% cho tất cả bánh kem',
        discount: 10,
        type: 'cake',
        emoji: '🎂',
        minOrder: 100000,
        expiryDate: '2026-03-31'
    },
    {
        id: 2,
        code: 'SWEET20',
        name: 'Giảm 20% cho bánh donut',
        description: 'Giảm giá 20% cho tất cả bánh donut',
        discount: 20,
        type: 'donut',
        emoji: '🍩',
        minOrder: 150000,
        expiryDate: '2026-02-28'
    },
    {
        id: 3,
        code: 'FRESH30',
        name: 'Giảm 30% cho hàng mới',
        description: 'Giảm giá 30% cho hàng mới nhất',
        discount: 30,
        type: 'new',
        emoji: '✨',
        minOrder: 200000,
        expiryDate: '2026-04-15'
    },
    {
        id: 4,
        code: 'NEWUSER15',
        name: 'Chào mừng người dùng mới',
        description: 'Giảm 15% cho khách hàng lần đầu',
        discount: 15,
        type: 'first-time',
        emoji: '👋',
        minOrder: 50000,
        expiryDate: '2026-02-20'
    },
    {
        id: 5,
        code: 'VIP50',
        name: 'VIP khách hàng thân thiết',
        description: 'Giảm 50% cho khách hàng VIP',
        discount: 50,
        type: 'vip',
        emoji: '👑',
        minOrder: 500000,
        expiryDate: '2026-12-31'
    },
    {
        id: 6,
        code: 'WELCOME20',
        name: 'Chào mừng bạn',
        description: 'Giảm 20% cho đơn hàng đầu tiên',
        discount: 20,
        type: 'welcome',
        emoji: '🎉',
        minOrder: 0,
        expiryDate: '2026-12-31'
    }
];

// ==================== DISPLAY VOUCHERS ====================
function displayVouchers() {
    const container = document.getElementById('vouchersContainer');
    if (!container) return;

    container.innerHTML = '';

    vouchers.forEach(voucher => {
        const voucherCard = createVoucherCard(voucher);
        container.appendChild(voucherCard);
    });
}

// ==================== CREATE VOUCHER CARD ====================
function createVoucherCard(voucher) {
    const card = document.createElement('div');
    card.className = 'voucher-card';
    
    const isExpired = new Date(voucher.expiryDate) < new Date();
    
    card.innerHTML = `
        <div class="voucher-emoji">${voucher.emoji}</div>
        <div class="voucher-content">
            <h3 class="voucher-code">${voucher.code}</h3>
            <p class="voucher-name">${voucher.name}</p>
            <p class="voucher-description">${voucher.description}</p>
            <div class="voucher-footer">
                <span class="voucher-discount">-${voucher.discount}%</span>
                <span class="voucher-expiry">Hết hạn: ${formatDate(voucher.expiryDate)}</span>
            </div>
            <button class="btn btn-primary btn-small" onclick="copyVoucherCode('${voucher.code}')" ${isExpired ? 'disabled' : ''}>
                ${isExpired ? 'Hết hạn' : 'Sao chép mã'}
            </button>
        </div>
    `;
    
    return card;
}

// ==================== FORMAT DATE ====================
function formatDate(dateString) {
    const date = new Date(dateString);
    return date.toLocaleDateString('vi-VN');
}

// ==================== COPY VOUCHER CODE ====================
function copyVoucherCode(code) {
    navigator.clipboard.writeText(code).then(() => {
        showToast(`Mã voucher "${code}" đã được sao chép!`);
    });
}

// ==================== SHOW TOAST MESSAGE ====================
function showToast(message, duration = 3000) {
    const toast = document.createElement('div');
    toast.style.cssText = `
        position: fixed;
        bottom: 20px;
        right: 20px;
        background-color: #ff1493;
        color: white;
        padding: 1rem 1.5rem;
        border-radius: 4px;
        box-shadow: 0 4px 12px rgba(0, 0, 0, 0.15);
        z-index: 9999;
        animation: slideIn 0.3s ease;
    `;
    toast.textContent = message;
    document.body.appendChild(toast);

    setTimeout(() => {
        toast.style.animation = 'slideOut 0.3s ease';
        setTimeout(() => toast.remove(), 300);
    }, duration);
}

// ==================== INITIALIZE ON PAGE LOAD ====================
document.addEventListener('DOMContentLoaded', function() {
    displayVouchers();
});
